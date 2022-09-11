insert into variant_group (id, name)
values (1, 'Groesse')
on conflict do nothing;

insert into variant (id, name, group_id)
values (1, '0,2l', 1)
on conflict do nothing;
insert into variant (id, name, group_id)
values (2, '0,4l', 1)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (1, 1, false)
on conflict do nothing;

insert into item_variant (item_id, variant_id, default_value)
values (1, 2, true)
on conflict do nothing;
