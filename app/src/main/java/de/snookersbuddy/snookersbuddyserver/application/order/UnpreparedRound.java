package de.snookersbuddy.snookersbuddyserver.application.order;

import de.snookersbuddy.snookersbuddyserver.application.configuration.option.OptionDTO;
import de.snookersbuddy.snookersbuddyserver.application.configuration.variant.VariantDTO;
import de.snookersbuddy.snookersbuddyserver.domain.model.order.OrderRound;
import de.snookersbuddy.snookersbuddyserver.domain.model.order.OrderedItem;
import lombok.Builder;

import java.time.Instant;
import java.util.List;

public record UnpreparedRound(long id, Instant orderedAt, List<UnpreparedRound.OrderedItemDto> orderedItems) {
    public static UnpreparedRound fromEntity(OrderRound round) {
        final var orderedItemDtos = round.getOrderedItems().stream().map(OrderedItemDto::fromEntity).toList();

        return new UnpreparedRound(round.getId(), round.getOrderedAt(), orderedItemDtos);
    }

    @Builder
    public record OrderedItemDto(long id,
                                 String name,
                                 long categoryId,
                                 List<OptionDTO> options,
                                 List<VariantDTO> variants) {

        public static OrderedItemDto fromEntity(OrderedItem item) {
            final var variantDtos = item.chosenVariants().stream().map(VariantDTO::fromEntity).toList();
            final var optionDtos = item.chosenOptions().stream().map(OptionDTO::fromEntity).toList();

            return UnpreparedRound.OrderedItemDto.builder()
                                                 .id(item.originalId())
                                                 .categoryId(item.category())
                                                 .name(item.name())
                                                 .variants(variantDtos)
                                                 .options(optionDtos)
                                                 .build();
        }
    }
}
