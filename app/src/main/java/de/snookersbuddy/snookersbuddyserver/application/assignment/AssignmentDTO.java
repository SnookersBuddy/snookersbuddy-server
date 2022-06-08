package de.snookersbuddy.snookersbuddyserver.application.assignment;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AssignmentDTO implements Serializable {

    private Long id;

    private String abbreviation;

    private boolean custom;
}
