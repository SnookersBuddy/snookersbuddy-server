package de.snookersbuddy.snookersbuddyserver.ports.rest.configuration;

import de.snookersbuddy.snookersbuddyserver.application.configuration.option.OptionDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantWithDefaultDTO;
import de.snookersbuddy.snookersbuddyserver.application.item.ItemDTO;

import java.util.Set;

public record GetConfigurationOutput(ItemDTO item, Set<VariantWithDefaultDTO> variants, Set<OptionDTO> options, int amount) {}
