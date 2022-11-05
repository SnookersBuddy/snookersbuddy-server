package de.snookersbuddy.snookersbuddyserver.application.item;

import de.snookersbuddy.snookersbuddyserver.domain.model.item.ItemCategories;

public record ItemCategoryDTO(String name, long id) {

    public static ItemCategoryDTO fromEntity(ItemCategories category) {
        return new ItemCategoryDTO(category.getCategoryName(), category.getId());
    }
}
