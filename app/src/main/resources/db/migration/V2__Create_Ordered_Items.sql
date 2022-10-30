create table order_round
(
    id            serial primary key,
    order_id      bigint    not null references snooker_order on delete cascade,
    state         varchar   not null,
    ordered_at    timestamp not null,
    ordered_items jsonb     not null
);
