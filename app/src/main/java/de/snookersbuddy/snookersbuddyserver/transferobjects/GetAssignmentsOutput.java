package de.snookersbuddy.snookersbuddyserver.transferobjects;

import de.snookersbuddy.snookersbuddyserver.model.transfermodel.AssignmentDTO;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
public class GetAssignmentsOutput implements Serializable {

    private Set<AssignmentDTO> assignments;
}
