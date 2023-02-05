package de.snookersbuddy.snookersbuddyserver.application.assignment;

import de.snookersbuddy.snookersbuddyserver.domain.model.assignment.Assignment;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public record AssignmentDTO(long id, String abbreviation, boolean custom, String displayName) {

    public static AssignmentDTO fromEntity(Assignment assignment) {
        return new AssignmentDTO(assignment.getId(), assignment.getAbbreviation(), assignment.isCustom(), assignment.getAssignmentName());
    }

    public static Set<AssignmentDTO> fromEntitySet(List<Assignment> assignments) {
        return assignments.stream().map(AssignmentDTO::fromEntity).collect(Collectors.toSet());
    }
}
