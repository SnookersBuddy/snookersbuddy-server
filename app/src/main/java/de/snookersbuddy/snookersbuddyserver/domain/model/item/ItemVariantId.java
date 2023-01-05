package de.snookersbuddy.snookersbuddyserver.domain.model.item;

import lombok.Data;

import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
@Data
public class ItemVariantId implements Serializable {
    private long itemId;
    private long variantId;
}
