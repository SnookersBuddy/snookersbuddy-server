package com.example.testapplicationbe.transferobjects;

import com.example.testapplicationbe.model.transfermodel.AssignmentDTO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class AssignmentTO implements Serializable {

    private List<AssignmentDTO> assignments;
}
