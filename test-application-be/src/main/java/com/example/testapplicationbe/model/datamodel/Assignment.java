package com.example.testapplicationbe.model.datamodel;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "assignment")
public class Assignment implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "abbreviation")
    private String abbreviation;

    @Column(name = "assignment_name")
    private String assignmentName;

    @Column(name = "custom")
    private boolean custom;


}
