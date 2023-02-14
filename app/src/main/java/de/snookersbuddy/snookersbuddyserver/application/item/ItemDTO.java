package de.snookersbuddy.snookersbuddyserver.application.item;

import de.snookersbuddy.snookersbuddyserver.domain.model.item.Item;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public record ItemDTO(long id, String itemName, String abbreviation, int categoryId, String description,
                      String specialFeature) {

    public static ItemDTO fromEntity(Item item) {
        return new ItemDTO(item.getId(), item.getName(), item.getAbbreviation(), item.getCategory(), item.getDescription(), item.getSpecialFeature());
    }

    public static Set<ItemDTO> fromEntityList(List<Item> items) {
        Set<ItemDTO> itemDTOS = new HashSet<>();
        items.forEach(item ->
                itemDTOS.add(ItemDTO.fromEntity(item)));
        return itemDTOS;
    }



}
