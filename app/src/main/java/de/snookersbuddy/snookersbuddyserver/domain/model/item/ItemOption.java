package de.snookersbuddy.snookersbuddyserver.domain.model.item;

import de.snookersbuddy.snookersbuddyserver.domain.model.option.Option;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "item_option")
public class ItemOption {
    @EmbeddedId
    private ItemOptionId id = new ItemOptionId();

    @MapsId("itemId")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id", referencedColumnName = "id")
    private Item item;

    @MapsId("optionId")
    @ManyToOne
    @JoinColumn(name = "option_id", referencedColumnName = "id")
    private Option option;

    @Column(name = "default_value")
    private boolean isDefaultEnabled;
}
