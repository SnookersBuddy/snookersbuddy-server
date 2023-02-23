create type assignment_availability as enum (
    'FREE',
    'OCCUPIED'
);

create table assignment
(
    id              serial primary key,
    abbreviation    varchar(255),
    assignment_name varchar(255) unique,
    custom          boolean,
    availability    assignment_availability not null default 'FREE'
);

create table item
(
    id              serial primary key,
    item_name       varchar(50),
    abbreviation    varchar(50),
    category        int,
    description     varchar(255),
    special_feature varchar(255)
);


create table snooker_order
(
    id         serial primary key,
    end_time   integer,
    start_time integer,
    assignment_id int references "assignment"
);
