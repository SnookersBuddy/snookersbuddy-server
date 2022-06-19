package de.snookersbuddy.snookersbuddyserver.domain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Table(name = "items")
@Entity
public class Item implements Serializable {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "item_name")
    private String name;

    @Column(name = "abbreviation")
    private String abbreviation;

    @Column(name = "category")
    private Integer category;

    @Column(name = "description")
    private String description;

    @Column(name = "special_feature")
    private String specialFeature;

}
