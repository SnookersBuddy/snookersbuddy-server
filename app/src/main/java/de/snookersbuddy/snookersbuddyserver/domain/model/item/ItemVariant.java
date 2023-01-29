package de.snookersbuddy.snookersbuddyserver.domain.model.item;

import de.snookersbuddy.snookersbuddyserver.domain.model.variant.Variant;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Getter
@Setter
@Table(name = "item_variant")
public class ItemVariant {

    public ItemVariant() {

    }

    public ItemVariant(Item item, Variant variant, boolean defaultValue) {
        this.item = item;
        this.variant = variant;
        this.isDefaultEnabled = defaultValue;
    }

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
