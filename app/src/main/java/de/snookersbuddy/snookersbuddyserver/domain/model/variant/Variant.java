package de.snookersbuddy.snookersbuddyserver.domain.model.variant;

import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@Table(name = "variant")
@Entity
public class Variant implements Serializable {

    public Variant(){

    }

    public Variant(long id){
        this.id = id;
    }

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id", nullable = false)
    private VariantGroup group;
}
