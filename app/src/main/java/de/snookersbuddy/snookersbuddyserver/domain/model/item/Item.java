package de.snookersbuddy.snookersbuddyserver.domain.model.item;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Table(name = "item")
@Entity
public class Item implements Serializable {

    public Item(Long id){
        this.id = id;
    }

    public Item(){

    }
    @Id
    @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item_name")
    private String name;

    @Column(name = "abbreviation")
    private String abbreviation;

    @Column(name = "category")
    private int category;

    @Column(name = "description")
    private String description;

    @Column(name = "special_feature")
    private String specialFeature;
}
