package de.snookersbuddy.snookersbuddyserver.domain.model.item;

import lombok.Getter;

import java.util.Arrays;

@Getter
public enum ItemCategories {

    // TODO: It has to be discussed, if we need this detailed categorisation, or sth. like "Spirituosen" is
    // TODO: engough for whiskey, liqueur ,brandy etc. See categorisation on https://boards.jlk.one/?controller=WikiController&action=detail&plugin=wiki&project_id=8&wiki_id=6
    // TODO: At this point, in my opinion a more detailed view could be helpful, but will definitely not be responsible for problems -> nice to have

    SOFTDRINK("Alkoholfreies Kaltgetränk", 1),

    JUICE("Saft", 2),

    WHISKEY("Whiskey", 3),

    LIQUEUR("Likör", 4),

    BRANDY("Weinbrand", 5),

    VODKA("Wodka", 6),

    RUM("Rum", 7),

    GIN("Gin", 8),

    APERITIF("Aperitif", 9),

    BEER_BOTTLE("Flaschenbiere", 10),

    BEER_DRAUGHT("Fassbiere", 11),

    WARM_DRINKS("Warme Getränke", 12),

    OTHER("Sonstiges", 13),

    ENERGY("Energy", 14),

    ICE_TEA("Eistee", 15),

    SCHWEPPES("Schweppes", 16),

    COCKTAIL("Cocktail", 17);

    private final String categoryName;
    private final int id;

    ItemCategories(String categoryName, int id) {
        this.categoryName = categoryName;
        this.id = id;
    }

    public static ItemCategories fromId(int categoryId) {
        return Arrays.stream(ItemCategories.values())
                     .filter(itemCategories -> itemCategories.getId() == categoryId)
                     .findFirst()
                     .orElseThrow(() -> new IllegalArgumentException(String.format("Can't find category with id %s",
                                                                                   categoryId)));
    }
}
