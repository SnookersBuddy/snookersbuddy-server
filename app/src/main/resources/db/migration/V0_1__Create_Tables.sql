create table assignment
(
    id              serial not null
        primary key,
    abbreviation    varchar(255),
    assignment_name varchar(255) unique,
    custom          boolean
);

create table items
(
    id              serial not null
        primary key,
    description     varchar(255),
    name            varchar(255),
    special_feature varchar(255)
);

create table options
(
    id   serial not null
        primary key,
    name varchar(255)
);

create table options_allowed_items
(
    option_id        serial not null
        references options,
    allowed_items_id serial not null
        unique
        references items
);

create table orders
(
    id         serial not null
        primary key,
    end_time   integer,
    start_time integer
);

create table users
(
    id    serial not null
        primary key,
    email varchar(255),
    name  varchar(255)
);

create table variants
(
    id   serial not null
        primary key,
    name varchar(255)
);

