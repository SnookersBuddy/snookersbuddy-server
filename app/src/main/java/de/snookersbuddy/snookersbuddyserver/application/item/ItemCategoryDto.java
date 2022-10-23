package de.snookersbuddy.snookersbuddyserver.application.item;

import de.snookersbuddy.snookersbuddyserver.domain.model.item.ItemCategories;

public record ItemCategoryDto(String name, long id) {

    public static ItemCategoryDto fromEntity(ItemCategories category) {
        return new ItemCategoryDto(category.getCategoryName(), category.getId());
    }
}
