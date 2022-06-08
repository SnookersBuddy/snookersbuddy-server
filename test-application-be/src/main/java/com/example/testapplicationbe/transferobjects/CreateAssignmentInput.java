package com.example.testapplicationbe.transferobjects;

import lombok.Data;

import java.io.Serializable;

@Data
public class CreateAssignmentInput implements Serializable {

    private String name;
}
