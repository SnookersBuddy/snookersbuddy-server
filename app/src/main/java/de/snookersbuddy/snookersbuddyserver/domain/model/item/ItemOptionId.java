package de.snookersbuddy.snookersbuddyserver.domain.model.item;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class ItemOptionId implements Serializable {
    private int itemId;
    private int optionId;
}