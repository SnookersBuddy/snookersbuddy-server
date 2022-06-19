package de.snookersbuddy.snookersbuddyserver.domain.model;

public enum ItemCategories {

    // TODO: It has to be discussed, if we need this detailed categorisation, or sth. like "Spirituosen" is
    // TODO: engough for whiskey, liquere,brandy etc. See categorisation on https://boards.jlk.one/?controller=WikiController&action=detail&plugin=wiki&project_id=8&wiki_id=6

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

    ICETEA("Eistee", 15),

    SCHWEPPES("Schweppes", 16);



    ItemCategories(String categoryName, int id) {
    }
}
