package de.snookersbuddy.snookersbuddyserver.application.configuration.option;

import de.snookersbuddy.snookersbuddyserver.domain.model.item.ItemOption;

public class OptionMapper {
    public static OptionDTO mapDataObjectOnTransferObject(final ItemOption itemOption) {
        final var option = itemOption.getOption();
        return new OptionDTO(option.getId(), option.getName(), itemOption.isDefaultEnabled());
    }
}
