package de.snookersbuddy.snookersbuddyserver.application.assignment;

import de.snookersbuddy.snookersbuddyserver.domain.model.assignment.Assignment;
import de.snookersbuddy.snookersbuddyserver.domain.model.assignment.AssignmentAvailability;
import de.snookersbuddy.snookersbuddyserver.domain.model.assignment.AssignmentRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AssignmentService {

    private static final boolean DEFAULT_CUSTOM_VALUE = false;
    private final AssignmentRepository assignmentRepository;

    public AssignmentService(AssignmentRepository assignmentRepository) {
        this.assignmentRepository = assignmentRepository;
    }

    public Set<AssignmentDTO> getAllAssignments() {
        final var assignments = AssignmentDTO.fromEntitySet(assignmentRepository.findAll());
        return Set.copyOf(assignments);
    }

    public void saveAssignment(AssignmentInput assignmentToCreate) {
        var assignment = mapAssignmentInputOnAssignment(assignmentToCreate);
        assignmentRepository.save(assignment);
    }

    public void updateAssignment(long assignmentId, AssignmentInput assignmentToUpdate) {
        final var assignment = assignmentRepository.findById(assignmentId)
                .orElseThrow(() -> new IllegalArgumentException(String.format(
                        "Could not find assignment with id %s",
                        assignmentId)));

        assignment.setDisplayName(assignmentToUpdate.displayName());
        assignment.setCustom(false);
        assignment.setAbbreviation(assignmentToUpdate.abbreviation());
        assignmentRepository.save(assignment);
    }

    public void deleteAssignment(long assignmentId) {
        this.assignmentRepository.deleteById(assignmentId);
    }

    public boolean createNewCustomAssignment(String name) {
        try {
            Assignment customAssignment = createDataObjectByTransferObject(name);
            assignmentRepository.save(customAssignment);
            return true;
        } catch (DataIntegrityViolationException d) {
            return false;
        }
    }

    private Assignment mapAssignmentInputOnAssignment(final AssignmentInput assignmentInput) {
        var assignment = new Assignment();
        assignment.setDisplayName(assignmentInput.displayName());
        assignment.setCustom(DEFAULT_CUSTOM_VALUE);
        assignment.setAbbreviation(assignmentInput.abbreviation());
        assignment.setAvailability(AssignmentAvailability.FREE);
        return  assignment;
    }

    private Assignment createDataObjectByTransferObject(String name) {
        Assignment customAssignment = new Assignment();
        customAssignment.setCustom(DEFAULT_CUSTOM_VALUE);
        customAssignment.setDisplayName(name);
        customAssignment.setAbbreviation(name);
        return customAssignment;
    }

    public AssignmentDTO getAssignment(long id) {
        return AssignmentDTO.fromEntity(assignmentRepository.getReferenceById(id));
    }

    public void occupyById(Long id) {
        setAvailabilityById(id, AssignmentAvailability.OCCUPIED);
    }

    public void freeById(Long id) {
        setAvailabilityById(id, AssignmentAvailability.FREE);
    }

    private void setAvailabilityById(Long id, AssignmentAvailability availability) {
        final var assignment = assignmentRepository.findById(id).orElseThrow();
        assignment.setAvailability(availability);
        assignmentRepository.save(assignment);
    }
}
