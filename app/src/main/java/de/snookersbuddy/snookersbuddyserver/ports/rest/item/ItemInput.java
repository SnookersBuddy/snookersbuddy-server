package de.snookersbuddy.snookersbuddyserver.ports.rest.item;

import de.snookersbuddy.snookersbuddyserver.application.item.ItemDTO;

public record ItemInput(ItemDTO itemDTO) {

    public static ItemInput fromEntity(ItemDTO item) {
        return new ItemInput(item);
    }

}
