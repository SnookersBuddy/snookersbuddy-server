package de.snookersbuddy.snookersbuddyserver.domain.model.order;

import lombok.Builder;

import java.util.List;

@Builder
public record OrderedItem(long originalId,
                          String name,
                          int category,
                          String description,
                          String specialFeature,
                          String comment,
                          List<ChosenOption> chosenOptions,
                          List<ChosenVariant> chosenVariants,
                          long amount) {
}