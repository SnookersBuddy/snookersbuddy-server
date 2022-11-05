package de.snookersbuddy.snookersbuddyserver.ports.rest.order;

import de.snookersbuddy.snookersbuddyserver.domain.model.order.RoundState;

public record UpdateRoundStateInput(RoundState state) {
}
