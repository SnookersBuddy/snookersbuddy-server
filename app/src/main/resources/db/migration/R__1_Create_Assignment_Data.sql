insert into assignment (id, assignment_name, abbreviation, custom)
values (1, 'Billard 1', '1', false)
on conflict do nothing;;
insert into assignment (id, assignment_name, abbreviation, custom)
values (2, 'Billard 2', '2', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (3, 'Billard 3', '3', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (4, 'Billard 4', '4', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (5, 'Billard 5', '5', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (6, 'Billard 6', '6', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (7, 'Billard 7', '7', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (8, 'Billard 8', '8', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (9, 'Billard 9', '9', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (10, 'Billard 10', '10', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (11, 'Snooker 1 (Billard 11)', '11', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (12, 'Snooker 2 (Billard 12)', '12', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (13, 'Esstisch 1', 'E1', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (14, 'Esstisch 2', 'E2', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (15, 'Esstisch 3', 'E3', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (16, 'Esstisch 4', 'E4', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (17, 'Esstisch 5', 'E5', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (18, 'Darts 1', 'D1', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (19, 'Darts 2', 'D2', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (20, 'Darts 3', 'D3', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (21, 'Couchtisch 1', 'C1', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (22, 'Couchtisch 2', 'C2', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (23, 'Eckbank links', 'Ebl', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (24, 'Eckbank rechts', 'Ebr', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (25, 'Kicker', 'K', false)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (26, 'Thore', 'Thore', true)
on conflict do nothing;
insert into assignment (id, assignment_name, abbreviation, custom)
values (27, 'Rainer W', 'Rainer W', true)
on conflict do nothing;

SELECT setval('assignment_id_seq', (SELECT MAX(id) FROM assignment)+1);
