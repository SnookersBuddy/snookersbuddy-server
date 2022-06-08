package com.example.testapplicationbe.transferobjects;

import com.example.testapplicationbe.model.transfermodel.AssignmentDTO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
public class GetAssignmentsOutput implements Serializable {

    private Set<AssignmentDTO> assignments;
}
