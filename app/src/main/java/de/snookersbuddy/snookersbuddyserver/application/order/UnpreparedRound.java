package de.snookersbuddy.snookersbuddyserver.application.order;

import de.snookersbuddy.snookersbuddyserver.application.configuration.option.OptionWithDefaultDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.SingleVariantDTO;
import de.snookersbuddy.snookersbuddyserver.application.item.ItemCategoryDTO;
import de.snookersbuddy.snookersbuddyserver.domain.model.item.ItemCategories;
import de.snookersbuddy.snookersbuddyserver.domain.model.order.OrderRound;
import de.snookersbuddy.snookersbuddyserver.domain.model.order.OrderedItem;
import lombok.Builder;

import java.time.Instant;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public record UnpreparedRound(long id, Instant orderedAt, Set<OrderedItemDto> orderedItems, String orderedBy) {
    public static UnpreparedRound fromEntity(OrderRound round) {
        final var orderedItemDtos = round.getOrderedItems()
                                         .stream()
                                         .map(OrderedItemDto::fromEntity)
                                         .collect(Collectors.toSet());

        return new UnpreparedRound(round.getId(),
                round.getOrderedAt(),
                orderedItemDtos,
                round.getOrder().getAssignment().getDisplayName());
    }

    @Builder
    public record OrderedItemDto(long id,
                                 String name,
                                 String comment,
                                 ItemCategoryDTO category,
                                 List<OptionWithDefaultDTO> options,
                                 List<SingleVariantDTO> variants,
                                 long amount) {

        public static OrderedItemDto fromEntity(OrderedItem item) {
            final var variantDtos = item.chosenVariants().stream().map(SingleVariantDTO::fromEntity).toList();
            final var optionDtos = item.chosenOptions().stream().map(OptionWithDefaultDTO::fromEntity).toList();

            final var itemCategoryDto = ItemCategoryDTO.fromEntity(ItemCategories.fromId(item.category()));

            return OrderedItemDto.builder()
                                 .id(item.originalId())
                                 .comment(item.comment())
                                 .category(itemCategoryDto)
                                 .name(item.name())
                                 .variants(variantDtos)
                                 .options(optionDtos)
                                 .amount(item.amount())
                                 .build();
        }
    }
}
