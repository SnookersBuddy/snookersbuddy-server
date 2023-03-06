package de.snookersbuddy.snookersbuddyserver.ports.rest.assignment;

public record GetAssignmentOutput(long id, String abbreviation, boolean custom, String displayName) {
}
