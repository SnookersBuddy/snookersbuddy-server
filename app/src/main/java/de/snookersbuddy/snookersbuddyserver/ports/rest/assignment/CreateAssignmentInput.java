package de.snookersbuddy.snookersbuddyserver.ports.rest.assignment;


import java.io.Serializable;

public record CreateAssignmentInput(String name) implements Serializable {}
