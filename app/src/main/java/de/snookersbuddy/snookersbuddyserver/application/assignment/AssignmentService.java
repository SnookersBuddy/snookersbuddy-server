package de.snookersbuddy.snookersbuddyserver.application.assignment;

import de.snookersbuddy.snookersbuddyserver.domain.model.assignment.Assignment;
import de.snookersbuddy.snookersbuddyserver.domain.model.assignment.AssignmentRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AssignmentService {

    private static final boolean DEFAULT_CUSTOM_VALUE = true;
    private final AssignmentRepository assignmentRepository;

    public AssignmentService(AssignmentRepository assignmentRepository) {
        this.assignmentRepository = assignmentRepository;
    }

    public Set<AssignmentDTO> getAllAssignments() {
        final var assignments = AssignmentMapper.mapDataObjectsOnTransferObjects(assignmentRepository.findAll());
        return Set.copyOf(assignments);
    }

    public boolean createNewCustomAssignment(String name) {
        try {
            Assignment customAssignment = createDataObjectByTransferObject(name);
            assignmentRepository.save(customAssignment);
            return true;
        } catch (DataIntegrityViolationException d) {
            // TODO: LOGGING?
            return false;
        }
    }

    private Assignment createDataObjectByTransferObject(String name) {
        Assignment customAssignment = new Assignment();
        customAssignment.setCustom(DEFAULT_CUSTOM_VALUE);
        customAssignment.setAssignmentName(name);
        customAssignment.setAbbreviation(name);
        return customAssignment;
    }


}
