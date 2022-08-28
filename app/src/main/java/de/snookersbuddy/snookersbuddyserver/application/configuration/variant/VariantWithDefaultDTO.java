package de.snookersbuddy.snookersbuddyserver.application.configuration.variant;

import java.util.Set;

public record VariantWithDefaultDTO(String name, long defaultVariantId, Set<VariantDTO> variants) {}
