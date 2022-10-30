insert into option (id, name)
values (1, 'Eis')
on conflict do nothing;

insert into option (id, name)
values (2, 'Zucker')
on conflict do nothing;

insert into option (id, name)
values (3, 'Zitrone')
on conflict do nothing;

insert into item_option (item_id, option_id, default_value)
values (1, 1, true)
on conflict do nothing;

insert into item_option (item_id, option_id, default_value)
values (1, 3, false)
on conflict do nothing;
