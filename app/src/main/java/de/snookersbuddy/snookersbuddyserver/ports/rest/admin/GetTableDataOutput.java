package de.snookersbuddy.snookersbuddyserver.ports.rest.admin;

import de.snookersbuddy.snookersbuddyserver.application.item.ItemDTO;
import de.snookersbuddy.snookersbuddyserver.domain.model.option.Option;
import de.snookersbuddy.snookersbuddyserver.domain.model.variant.Variant;

import java.util.List;

public record GetTableDataOutput(List<ItemDTO> items, List<Option> options, List<Variant> variants) {
}
