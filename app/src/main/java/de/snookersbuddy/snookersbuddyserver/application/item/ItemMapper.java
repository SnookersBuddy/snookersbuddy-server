package de.snookersbuddy.snookersbuddyserver.application.item;

import de.snookersbuddy.snookersbuddyserver.domain.model.item.Item;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ItemMapper {

    public static Set<ItemDTO> mapDataObjectsOnTransferObjects(List<Item> dataObjects) {
        Set<ItemDTO> transferObjects = new HashSet<>();
        for (Item dataObject : dataObjects) {
            transferObjects.add(mapDataObjectOnTransferObject(dataObject));
        }
        return transferObjects;
    }

    private static ItemDTO mapDataObjectOnTransferObject(Item dataObject) {
        ItemDTO transferObject = new ItemDTO();
        transferObject.setId(dataObject.getId());
        transferObject.setItemName(dataObject.getName());
        // TODO - further properties ? DifferentDTOs? Values like desc. and category not needed here
        return transferObject;
    }
}
