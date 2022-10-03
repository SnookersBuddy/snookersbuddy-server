package de.snookersbuddy.snookersbuddyserver.ports.rest.ordereditem;

import de.snookersbuddy.snookersbuddyserver.domain.model.assignment.Assignment;
import de.snookersbuddy.snookersbuddyserver.domain.model.item.Item;

import java.util.List;

public record CreateOrderInput(Assignment assignment, List<Item> items) {
}
