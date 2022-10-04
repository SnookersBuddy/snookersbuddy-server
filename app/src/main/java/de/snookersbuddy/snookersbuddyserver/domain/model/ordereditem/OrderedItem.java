package de.snookersbuddy.snookersbuddyserver.domain.model.ordereditem;

import de.snookersbuddy.snookersbuddyserver.domain.model.order.Order;
import de.snookersbuddy.snookersbuddyserver.domain.model.item.Item;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Table(name = "ordered_items")
@Entity
public class OrderedItem implements Serializable {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
    @JoinColumn(name = "order_id", referencedColumnName = "id")
    private Order order;

    @Column(name = "round")
    private int round;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
    @JoinColumn(name = "item_id", referencedColumnName = "id")
    private Item item;

    @Column(name = "chosen_options")
    private String chosenOptions;

    @Column(name = "chosen_variants")
    private String chosenVariants;

    @Column(name = "comment")
    private String comment;

    // TODO: ENUM-ID..?
    @Column(name = "state")
    private int state;
}
