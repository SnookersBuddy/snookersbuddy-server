package de.snookersbuddy.snookersbuddyserver.ports.rest.assignment;

import lombok.Data;

import java.io.Serializable;

public record CreateAssignmentInput(String name) implements Serializable {}
