package de.snookersbuddy.snookersbuddyserver.application.assignment;

import de.snookersbuddy.snookersbuddyserver.domain.model.assignment.Assignment;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public record AssignmentDTO(long id, String abbreviation, boolean custom, String displayName) {

    public static AssignmentDTO fromEntity(Assignment assignment) {
        return new AssignmentDTO(assignment.getId(), assignment.getAbbreviation(), assignment.isCustom(), assignment.getAssignmentName());
    }

    public static Set<AssignmentDTO> fromEntitySet(List<Assignment> assignments) {
        Set<AssignmentDTO> assignmentDTOS = new HashSet<>();
        assignments.forEach(assignment ->
                assignmentDTOS.add(fromEntity(assignment)));
        return assignmentDTOS;
    }
}
