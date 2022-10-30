package de.snookersbuddy.snookersbuddyserver.application.item;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class ItemDTO implements Serializable{

    private Long id;
    private String itemName;
    private String abbreviation;
    private int categoryId;
    private String description;
    private String specialFeature;
}
