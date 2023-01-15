insert into option (id, name)
values (1, 'Eis')
on conflict do nothing;

insert into option (id, name)
values (2, 'Zucker')
on conflict do nothing;

insert into option (id, name)
values (3, 'Zitrone')
on conflict do nothing;

insert into option (id, name)
values (4, 'Kekse')
on conflict do nothing;

insert into option (id, name)
values (5, 'Kaffeebohnen')
on conflict do nothing;

SELECT setval('option_id_seq', (SELECT MAX(id) FROM option)+1);

----
insert into item_option (item_id, option_id, default_value)
values (1, 1, true)
on conflict do nothing;

insert into item_option (item_id, option_id, default_value)
values (1, 3, false)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (2, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (3, 1, true)
on conflict do nothing;

insert into item_option (item_id, option_id, default_value)
values (3, 3, false)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (4, 1, true)
on conflict do nothing;

insert into item_option (item_id, option_id, default_value)
values (4, 3, false)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (5, 1, true)
on conflict do nothing;

insert into item_option (item_id, option_id, default_value)
values (5, 3, false)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (6, 1, true)
on conflict do nothing;

insert into item_option (item_id, option_id, default_value)
values (6, 3, false)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (7, 1, true)
on conflict do nothing;

insert into item_option (item_id, option_id, default_value)
values (7, 3, false)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (8, 1, true)
on conflict do nothing;

insert into item_option (item_id, option_id, default_value)
values (8, 3, false)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (9, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (10, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (11, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (12, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (13, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (14, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (15, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (16, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (17, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (18, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (190, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (200, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (21, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (22, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (23, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (27, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (28, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (34, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (360, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (38, 5, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (39, 5, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (400, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (41, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (42, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (430, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (440, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (460, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (470, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (480, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (490, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (500, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (510, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (52, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (530, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (540, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (550, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (56, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (57, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (58, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (78, 2, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (78, 4, false)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (79, 4, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (80, 2, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (68, 2, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (96, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (97, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (98, 1, true)
on conflict do nothing;
----

insert into item_option (item_id, option_id, default_value)
values (99, 1, true)
on conflict do nothing;
----
