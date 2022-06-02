package com.example.testapplicationbe.model.datamodel;

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
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "allowed_items")
    @OneToMany
    //FIXME
    private List<Item> allowedItems;
}
