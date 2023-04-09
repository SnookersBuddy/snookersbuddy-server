package de.snookersbuddy.snookersbuddyserver.application.assignment;

import de.snookersbuddy.snookersbuddyserver.domain.model.assignment.Assignment;
import de.snookersbuddy.snookersbuddyserver.domain.model.assignment.AssignmentAvailability;
import de.snookersbuddy.snookersbuddyserver.domain.model.assignment.AssignmentRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AssignmentService {

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
        assignment.setCustom(assignmentToUpdate.custom());
        assignment.setAbbreviation(assignmentToUpdate.abbreviation());
        assignmentRepository.save(assignment);
    }

    public void deleteAssignment(long assignmentId) {
        this.assignmentRepository.deleteById(assignmentId);
    }

    private Assignment mapAssignmentInputOnAssignment(final AssignmentInput assignmentInput) {
        var assignment = new Assignment();
        assignment.setDisplayName(assignmentInput.displayName());
        assignment.setCustom(assignmentInput.custom());
        assignment.setAbbreviation(assignmentInput.abbreviation());
        assignment.setAvailability(AssignmentAvailability.FREE);
        return  assignment;
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
