package de.snookersbuddy.snookersbuddyserver.domain.model.assignment;

import io.hypersistence.utils.hibernate.type.basic.PostgreSQLEnumType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "assignment")
public class Assignment implements Serializable {

    @Id
    @Column(name = "id", updatable = false, nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "abbreviation")
    private String abbreviation;

    @Column(name = "assignment_name")
    private String assignmentName;

    @Column(name = "custom")
    private boolean custom;

    @Column(name = "availability")
    @Type(PostgreSQLEnumType.class)
    @Enumerated(EnumType.STRING)
    private AssignmentAvailability availability;
}
