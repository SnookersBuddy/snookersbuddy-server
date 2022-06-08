package de.snookersbuddy.snookersbuddyserver.service;

import de.snookersbuddy.snookersbuddyserver.model.datamodel.Assignment;
import de.snookersbuddy.snookersbuddyserver.persistence.AssignmentRepository;
import de.snookersbuddy.snookersbuddyserver.transferobjects.GetAssignmentsOutput;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class AssignmentService {

    private final AssignmentRepository assignmentRepository;

    private static final boolean DEFAULT_CUSTOM_VALUE = true;

    public AssignmentService(AssignmentRepository assignmentRepository) {
        this.assignmentRepository = assignmentRepository;
    }

    public GetAssignmentsOutput getAllAssignments() {
        GetAssignmentsOutput getAssignmentsOutput = new GetAssignmentsOutput();
        List<Assignment> assignmentDataObjects = Collections.emptyList();
        assignmentDataObjects = assignmentRepository.findAll();
        getAssignmentsOutput.setAssignments(AssignmentMapper.mapDataObjectsOnTransferObjects(assignmentDataObjects));

        return getAssignmentsOutput;
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
