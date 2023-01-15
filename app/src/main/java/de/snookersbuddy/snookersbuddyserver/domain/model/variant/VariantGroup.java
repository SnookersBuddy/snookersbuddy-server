package de.snookersbuddy.snookersbuddyserver.domain.model.variant;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "variant_group")
public class VariantGroup {

    public VariantGroup() {
    }

    public VariantGroup(long id) {
        this.id = id;
    }

    @Setter(AccessLevel.NONE)
    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;
}
