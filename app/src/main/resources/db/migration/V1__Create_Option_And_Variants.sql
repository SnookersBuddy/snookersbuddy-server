create table variant_group
(
    id   serial primary key,
    name text not null unique
);

create table variant
(
    id       serial primary key,
    name     varchar(255),
    group_id int references variant_group on delete cascade
);

/* join table items and variants */
create table item_variant
(
    item_id       int references item on delete cascade,
    variant_id    int references variant on delete cascade,
    default_value boolean default false,
    primary key (item_id, variant_id)
);

create table "option"
(
    id   serial primary key,
    name varchar(255)
);

/* join table items and options */
create table item_option
(
    item_id       int references item on delete cascade ,
    option_id     int references "option" on delete cascade,
    default_value boolean default false,
    /* reference is ItemOptionId */
    primary key (item_id, option_id)
);

