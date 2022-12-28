package de.snookersbuddy.snookersbuddyserver.ports.rest.order;

import de.snookersbuddy.snookersbuddyserver.domain.model.assignment.Assignment;

import jakarta.validation.constraints.NotNull;

public record InitOrderInput(@NotNull Assignment assignment) {
}
