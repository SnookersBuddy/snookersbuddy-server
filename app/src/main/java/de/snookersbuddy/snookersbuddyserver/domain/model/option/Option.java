package de.snookersbuddy.snookersbuddyserver.domain.model.option;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@Table(name = "option")
@Entity
public class Option implements Serializable {

    public Option(long id){
        this.id = id;
    }

    public Option(){}

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;
}
