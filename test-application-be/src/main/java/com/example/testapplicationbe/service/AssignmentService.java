package com.example.testapplicationbe.service;

import com.example.testapplicationbe.model.datamodel.Assignment;
import com.example.testapplicationbe.model.transfermodel.AssignmentDTO;
import com.example.testapplicationbe.persistence.AssignmentRepository;
import com.example.testapplicationbe.transferobjects.AssignmentTO;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class AssignmentService extends AbstractService {

    private final AssignmentRepository assignmentRepository;

    private static final boolean DEFAULT_CUSTOM_VALUE = true;

    public AssignmentService(AssignmentRepository assignmentRepository) {
        this.assignmentRepository = assignmentRepository;
    }

    public AssignmentTO getAllAssignments() {
        AssignmentTO assignmentTO = new AssignmentTO();
        List<Assignment> assignmentDataObjects = Collections.emptyList();
        assignmentDataObjects = assignmentRepository.findAll();
        assignmentTO.setAssignments(mapDataObjectsOnTransferObjects(assignmentDataObjects));

        return assignmentTO;
    }

    public boolean createNewCustomAssignment(String name) {
        try {
            Assignment customAssignment = createDataObjectByTransferObject(name);
            assignmentRepository.save(customAssignment);
                    return true;
        }
        catch(DataIntegrityViolationException d){
            // TODO: LOGGING?
            return false;
        }
    }

    private Assignment createDataObjectByTransferObject(String name){
        Assignment customAssignment = new Assignment();
        customAssignment.setCustom(DEFAULT_CUSTOM_VALUE);
        customAssignment.setAssignmentName(name);
        customAssignment.setAbbreviation(name);
        return customAssignment;
    }

    private List<AssignmentDTO> mapDataObjectsOnTransferObjects(List<Assignment> dataObjects) {

        List<AssignmentDTO> transferObjects = new ArrayList<>();
        for (Assignment dataObject : dataObjects) {
            transferObjects.add(mapDataObjectOnTransferObject(dataObject));
        }
        return transferObjects;
    }

    private AssignmentDTO mapDataObjectOnTransferObject(Assignment dataObject) {

        AssignmentDTO transferObject = new AssignmentDTO();
        transferObject.setId(dataObject.getId());
        transferObject.setAbbreviation(dataObject.getAbbreviation());
        transferObject.setCustom(dataObject.isCustom());

        return transferObject;
    }
}
