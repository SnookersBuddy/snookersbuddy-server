package de.snookersbuddy.snookersbuddyserver.application.assignment;

import de.snookersbuddy.snookersbuddyserver.domain.model.assignment.Assignment;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AssignmentMapper {

    public static Set<AssignmentDTO> mapDataObjectsOnTransferObjects(List<Assignment> dataObjects) {
        Set<AssignmentDTO> transferObjects = new HashSet<>();
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
        transferObject.setDisplayName(dataObject.getAssignmentName());

        return transferObject;
    }
}
