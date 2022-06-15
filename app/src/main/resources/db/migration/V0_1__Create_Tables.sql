create table assignment
(
    id              bigint not null
        constraint assignment_pkey
            primary key,
    abbreviation    varchar(255),
    assignment_name varchar(255),
    custom          boolean
);

create table items
(
    id              bigint not null
        constraint items_pkey
            primary key,
    description     varchar(255),
    name            varchar(255),
    special_feature varchar(255)
);

create table options
(
    id   bigint not null
        constraint options_pkey
            primary key,
    name varchar(255)
);

create table options_allowed_items
(
    option_id        bigint not null
        constraint fk230ypd1bfiuodxcm8q280eq8t
            references options,
    allowed_items_id bigint not null
        constraint uk_npuur7p5exmxjcef28h6bxq6l
            unique
        constraint fk62d8bxinnap5ps0l09mxvw4kh
            references items
);

create table orders
(
    id         bigint not null
        constraint orders_pkey
            primary key,
    end_time   integer,
    start_time integer
);

create table users
(
    id    bigint not null
        constraint users_pkey
            primary key,
    email varchar(255),
    name  varchar(255)
);

create table variants
(
    id   bigint not null
        constraint variants_pkey
            primary key,
    name varchar(255)
);

