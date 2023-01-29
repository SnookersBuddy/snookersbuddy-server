package de.snookersbuddy.snookersbuddyserver.application.order;

import de.snookersbuddy.snookersbuddyserver.application.configuration.option.OptionWithDefaultDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.SingleVariantDTO;
import de.snookersbuddy.snookersbuddyserver.application.item.ItemDTO;
import de.snookersbuddy.snookersbuddyserver.domain.model.order.OrderedItem;

import jakarta.validation.constraints.NotNull;
import java.util.List;

public record OrderedItemDTO(@NotNull ItemDTO item,
                             @NotNull List<SingleVariantDTO> chosenVariants,
                             @NotNull List<OptionWithDefaultDTO> chosenOptions,
                             String comment,
                             long amount) {

    public OrderedItem toEntity() {
        final var chosenOptions = chosenOptions().stream().map(OptionWithDefaultDTO::toEntity).toList();
        final var chosenVariants = chosenVariants().stream().map(SingleVariantDTO::toEntity).toList();

        return OrderedItem.builder()
                          .originalId(item.id())
                          .name(item.itemName())
                          .category(item.categoryId())
                          .description(item.description())
                          .specialFeature(item.specialFeature())
                          .comment(comment)
                          .chosenOptions(chosenOptions)
                          .chosenVariants(chosenVariants)
                          .amount(amount)
                          .build();
    }
}
