package de.snookersbuddy.snookersbuddyserver.ports.rest.assignment;

import de.snookersbuddy.snookersbuddyserver.application.assignment.AssignmentDTO;

import java.io.Serializable;
import java.util.Set;

public record GetAssignmentsOutput(Set<AssignmentDTO> assignments) implements Serializable {}
