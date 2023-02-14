package de.snookersbuddy.snookersbuddyserver.domain.model.item;

import de.snookersbuddy.snookersbuddyserver.domain.model.option.Option;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Getter
@Setter
@Table(name = "item_option")
public class ItemOption {

    public ItemOption(){

    }

    public ItemOption(Item item, Option option, boolean isDefaultEnabled){
        this.item = item;
        this.option = option;
        this.isDefaultEnabled = isDefaultEnabled;
    }

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
