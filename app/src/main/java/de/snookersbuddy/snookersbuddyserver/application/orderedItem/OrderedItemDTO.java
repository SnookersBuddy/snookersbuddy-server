package de.snookersbuddy.snookersbuddyserver.application.orderedItem;

import de.snookersbuddy.snookersbuddyserver.application.item.ItemDTO;
import de.snookersbuddy.snookersbuddyserver.domain.model.item.Item;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class OrderedItemDTO implements Serializable {

    private ItemDTO item;
    private String variantIdList;
    private String optionIdList;
    private String comment;
}
