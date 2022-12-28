package de.snookersbuddy.snookersbuddyserver.domain.model.item;

import lombok.Data;

import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class ItemOptionId implements Serializable {
    private long itemId;
    private long optionId;
}
