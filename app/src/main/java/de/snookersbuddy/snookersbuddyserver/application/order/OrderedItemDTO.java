package de.snookersbuddy.snookersbuddyserver.application.order;

import de.snookersbuddy.snookersbuddyserver.application.configuration.option.OptionDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantDTO;
import de.snookersbuddy.snookersbuddyserver.application.item.ItemDTO;
import de.snookersbuddy.snookersbuddyserver.domain.model.order.OrderedItem;

import javax.validation.constraints.NotNull;
import java.util.List;

public record OrderedItemDTO(@NotNull ItemDTO item,
                             @NotNull List<VariantDTO> chosenVariants,
                             @NotNull List<OptionDTO> chosenOptions,
                             String comment) {

    public OrderedItem toEntity() {
        final var chosenOptions = chosenOptions().stream().map(OptionDTO::toEntity).toList();
        final var chosenVariants = chosenVariants().stream().map(VariantDTO::toEntity).toList();

        return OrderedItem.builder()
                          .originalId(item.getId())
                          .name(item.getItemName())
                          .category(item.getCategoryId())
                          .description(item.getDescription())
                          .specialFeature(item.getSpecialFeature())
                          .chosenOptions(chosenOptions)
                          .chosenVariants(chosenVariants)
                          .build();
    }
}
