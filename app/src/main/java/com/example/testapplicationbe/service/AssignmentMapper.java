package com.example.testapplicationbe.service;

import com.example.testapplicationbe.model.datamodel.Assignment;
import com.example.testapplicationbe.model.transfermodel.AssignmentDTO;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class AssignmentMapper {

    public static Set<AssignmentDTO> mapDataObjectsOnTransferObjects(List<Assignment> dataObjects) {

        Set<AssignmentDTO> transferObjects = new LinkedHashSet<>();
        for (Assignment dataObject : dataObjects) {
            transferObjects.add(mapDataObjectOnTransferObject(dataObject));
        }
        return transferObjects;
    }

    public static AssignmentDTO mapDataObjectOnTransferObject(Assignment dataObject) {

        AssignmentDTO transferObject = new AssignmentDTO();
        transferObject.setId(dataObject.getId());
        transferObject.setAbbreviation(dataObject.getAbbreviation());
        transferObject.setCustom(dataObject.isCustom());

        return transferObject;
    }
}
