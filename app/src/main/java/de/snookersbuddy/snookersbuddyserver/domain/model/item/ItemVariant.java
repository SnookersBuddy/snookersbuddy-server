package de.snookersbuddy.snookersbuddyserver.domain.model.item;

import de.snookersbuddy.snookersbuddyserver.domain.model.variant.Variant;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "item_variant")
public class ItemVariant {
    @EmbeddedId
    private ItemVariantId id = new ItemVariantId();

    @MapsId("itemId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id", referencedColumnName = "id")
    private Item item;

    @MapsId("variantId")
    @ManyToOne
    @JoinColumn(name = "variant_id", referencedColumnName = "id")
    private Variant variant;

    @Column(name = "default_value")
    private boolean isDefaultEnabled;
}
