create table "ordered_items"
(
    id              serial primary key,
    order_id        int references "order",
    round           int,
    item_id         int references "item",
    chosen_options  varchar(50),
    chosen_variants varchar(50),
    comment         varchar(150),
    state           int
);
