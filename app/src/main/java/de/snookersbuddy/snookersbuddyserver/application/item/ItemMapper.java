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

    public static ItemDTO mapDataObjectOnTransferObject(Item dataObject) {
        ItemDTO transferObject = new ItemDTO();
        transferObject.setId(dataObject.getId());
        transferObject.setItemName(dataObject.getName());
        transferObject.setAbbreviation(dataObject.getAbbreviation());
        transferObject.setCategoryId(dataObject.getCategory());
        return transferObject;
    }

    public static Item mapTransferObjectOnDataObject(ItemDTO itemDTO) {
        var item = new Item();
        item.setId(itemDTO.getId());
        item.setAbbreviation("C");
        item.setCategory(1);
        item.setDescription(null);
        item.setName("Cola");
        item.setSpecialFeature(null);
        return item;
    }
}
