package de.snookersbuddy.snookersbuddyserver.ports.rest.ordereditem;

import de.snookersbuddy.snookersbuddyserver.application.orderedItem.OrderedItemDTO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class CreateOrderInput implements Serializable {

    private List<OrderedItemDTO> orderedItems;
}
