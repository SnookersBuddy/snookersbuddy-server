insert into variant_group (id, name)
values (1, 'Größe')
on conflict do nothing;

insert into variant_group (id, name)
values (2, 'Softdrink')
on conflict do nothing;

insert into variant (id, name, group_id)
values (1, '0,4l', 1)
on conflict do nothing;
insert into variant (id, name, group_id)
values (2, '0,5l', 1)
on conflict do nothing;
insert into variant (id, name, group_id)
values (3, '2cl', 1)
on conflict do nothing;
insert into variant (id, name, group_id)
values (4, '4cl', 1)
on conflict do nothing;

insert into variant (id, name, group_id)
values (5, 'Cola', 2)
on conflict do nothing;
insert into variant (id, name, group_id)
values (6, 'Fanta', 2)
on conflict do nothing;
insert into variant (id, name, group_id)
values (7, 'Sprite', 2)
on conflict do nothing;
insert into variant (id, name, group_id)
values (8, 'Energy', 2)
on conflict do nothing;
insert into variant (id, name, group_id)
values (9, 'O-Saft', 2)
on conflict do nothing;
insert into variant (id, name, group_id)
-- TODO - Shot is not good here ... what can we do ? Option ?
-- TODO - This "option" should disable all other configurations such as variants and other options
values (10, 'Shot', 2)
on conflict do nothing;
insert into variant (id, name, group_id)
values (11, 'Ginger Ale', 2)
on conflict do nothing;
insert into variant (id, name, group_id)
values (12, 'Maracuja', 2)
on conflict do nothing;
insert into variant (id, name, group_id)
values (13, 'Tonic Water', 2)
on conflict do nothing;


----
insert into item_variant (item_id, variant_id, default_value)
values (1, 1, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (1, 2, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (2, 1, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (2, 2, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (3, 1, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (3, 2, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (4, 1, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (4, 2, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (5, 1, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (5, 2, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (6, 1, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (6, 2, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (7, 1, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (7, 2, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (8, 1, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (8, 2, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (9, 1, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (9, 2, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (10, 1, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (10, 2, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (11, 1, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (11, 2, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (12, 1, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (12, 2, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (13, 1, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (13, 2, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (14, 1, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (14, 2, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (15, 1, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (15, 2, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (19, 3, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (19, 4, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (19, 5, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (19, 7, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (19, 10, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (20, 3, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (20, 4, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (20, 5, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (20, 7, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (20, 10, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (29, 3, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (29, 4, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (31, 3, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (31, 4, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (32, 3, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (32, 4, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (35, 3, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (35, 4, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (36, 3, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (36, 4, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (36, 10, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (36, 5, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (37, 3, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (37, 4, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (38, 3, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (38, 4, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (39, 3, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (39, 4, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (40, 3, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (40, 4, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (40, 5, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (40, 7, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (40, 11, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (43, 3, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (43, 4, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (43, 5, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (43, 6, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (43, 7, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (43, 8, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (43, 9, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (43, 10, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (44, 3, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (44, 4, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (44, 5, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (44, 6, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (44, 7, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (44, 8, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (44, 9, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (44, 10, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (46, 3, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (46, 4, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (46, 5, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (46, 6, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (46, 7, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (46, 8, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (46, 9, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (46, 10, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (47, 3, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (47, 4, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (47, 5, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (47, 6, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (47, 7, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (47, 8, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (47, 9, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (47, 10, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (48, 3, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (48, 4, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (48, 5, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (48, 6, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (48, 7, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (48, 8, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (48, 9, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (48, 10, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (49, 3, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (49, 4, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (49, 5, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (49, 6, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (49, 7, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (49, 8, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (49, 9, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (49, 10, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (50, 3, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (50, 4, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (50, 5, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (50, 6, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (50, 7, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (50, 8, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (50, 9, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (50, 10, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (51, 3, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (51, 4, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (51, 5, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (51, 6, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (51, 7, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (51, 8, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (51, 9, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (51, 10, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (53, 3, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (53, 4, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (53, 5, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (53, 10, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (54, 3, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (54, 4, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (54, 5, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (54, 10, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (55, 3, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (55, 4, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (55, 12, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (55, 7, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (57, 3, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (57, 4, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (57, 13, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (75, 1, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (75, 2, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (76, 1, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (76, 2, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (86, 3, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (86, 4, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (87, 3, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (87, 4, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (88, 3, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (88, 4, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (89, 3, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (89, 4, false)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (94, 3, true)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (94, 4, false)
on conflict do nothing;
----

---- TODO Eistee Pfirsich und Zitrone als Varianten anstatt einzelne Getränke ?
insert into item_variant (item_id, variant_id, default_value)
values (98, 1, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (98, 2, true)
on conflict do nothing;
----

insert into item_variant (item_id, variant_id, default_value)
values (99, 1, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (99, 2, true)
on conflict do nothing;






