package de.snookersbuddy.snookersbuddyserver.domain.model;

import de.snookersbuddy.snookersbuddyserver.domain.model.item.Item;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Table(name = "options")
@Entity
public class Option implements Serializable {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "allowed_items")
    @OneToMany
    //FIXME
    private List<Item> allowedItems;
}
