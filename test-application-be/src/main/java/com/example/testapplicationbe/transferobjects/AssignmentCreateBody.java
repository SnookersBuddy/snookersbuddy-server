package com.example.testapplicationbe.transferobjects;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class AssignmentCreateBody implements Serializable {

    private String name;
}
