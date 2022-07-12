package de.snookersbuddy.snookersbuddyserver.ports.rest.item;

import de.snookersbuddy.snookersbuddyserver.application.item.ItemDTO;

import java.io.Serializable;
import java.util.Set;

public record GetItemsOutput(Set<ItemDTO> items) implements Serializable {
}
