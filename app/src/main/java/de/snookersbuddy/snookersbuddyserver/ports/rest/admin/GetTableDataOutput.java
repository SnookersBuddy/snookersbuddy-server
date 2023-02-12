package de.snookersbuddy.snookersbuddyserver.ports.rest.admin;

import de.snookersbuddy.snookersbuddyserver.application.item.ItemDTO;
import de.snookersbuddy.snookersbuddyserver.application.variant.VariantGroupDTO;
import de.snookersbuddy.snookersbuddyserver.domain.model.assignment.Assignment;
import de.snookersbuddy.snookersbuddyserver.domain.model.option.Option;
import de.snookersbuddy.snookersbuddyserver.domain.model.variant.Variant;

import java.util.List;
import java.util.Set;

public record GetTableDataOutput(List<ItemDTO> items, List<Option> options, Set<VariantGroupDTO> variants, List<Assignment> assignments) {
}
