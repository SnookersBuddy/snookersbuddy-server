package de.snookersbuddy.snookersbuddyserver.domain.model.item;

import lombok.Data;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class ItemVariantId implements Serializable {
    private int itemId;
    private int variantId;
}
