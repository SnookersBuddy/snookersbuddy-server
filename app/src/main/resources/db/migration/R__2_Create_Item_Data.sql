-- Insertions for Items-Table ordered by item-categories
-- 1
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (1, 'Cola', 'C', 1, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (2, 'Fanta', 'F', 1, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (3, 'Sprite', 'SPR', 1, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (4, 'Cola Zero', 'CZ', 1, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (5, 'Cola Light', 'CL', 1, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (6, 'Spezi', 'SPE', 1, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (7, 'Mineralwasser', 'W', 1, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (8, 'Stilles Wasser', 'STW', 1, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
-- 2
values (9, 'Apfelsaft', 'AS', 2, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
-- TODO Apfelsaftschorle ? + SCH
values (10, 'Orangennektar', 'OS', 2, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (11, 'Kirschnektar', 'KS', 2, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (12, 'Bananennektar', 'BS', 2, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (13, 'Maracujanektar', 'MARA', 2, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (14, 'Ananassaft', 'ANA', 2, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (15, 'Cranberrynektar', 'CRA', 2, null, null)
on conflict do nothing;
-- 3
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (16, 'Ballantines', 'BAL', 3, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (17, 'Canadian Club', 'CAN', 3, null, null)
on conflict do nothing;
-- TODO: Maybe CAC
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (18, 'Glenfiddich', 'GLE', 3, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (19, 'Jack Daniels', 'JD', 3, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (20, 'Jim Beam', 'JB', 3, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (21, 'Jim Beam Black', 'JBB', 3, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (22, 'Johnny Walker Red Label', 'JWRL', 3, null, null)
on conflict do nothing;
-- TODO: Maybe JRL
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (23, 'Johnny Walker Black Label', 'JWBL', 3, null, null)
on conflict do nothing;
-- TODO: Maybe JBL
-- 4
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (25, 'Amaretto', 'AMA', 4, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (26, 'Aperol', 'WAS', 4, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (27, 'Baileys', 'BAIL', 4, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (28, 'Batida de Coco', 'BAT', 4, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (29, 'Berliner Luft', 'BER', 4, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (30, 'Campari', 'CAM', 4, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (31, 'Dirty Harry', 'DH', 4, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (32, 'Jägermeister', 'JÄG', 4, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (33, 'Kümmerling', 'KÜM', 4, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (34, 'Licor 43', 'L43', 4, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (35, 'Ouzo', 'OUZ', 4, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (36, 'Pernod', 'PER', 4, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (37, 'Ramazotti', 'RAMA', 4, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (38, 'Sambuca White', 'SAM', 4, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (39, 'Sambuca Caffe', 'SAMC', 4, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (40, 'Southern Comfort', 'SOU', 4, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
-- 5
values (41, 'Chantre', 'CHA', 5, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (42, 'Scharlachberg', 'SCH', 5, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
-- 6
values (43, 'Moskovskaya', 'MOS', 6, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (44, 'Smirnoff', 'SMI', 6, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (45, 'Feigling', 'FEI', 6, null, null)
on conflict do nothing;
-- 7
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (46, 'Bacardi Oakheart', 'BACO', 7, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (47, 'Bacardi Razz', 'BACR', 7, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (48, 'Bacardi White', 'BAC', 7, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (49, 'Bacardi Gold', 'BACG', 7, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (50, 'Bacardi Black', 'BACB', 7, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (51, 'Captain Morgan', 'CM', 7, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (52, 'Hansen Rum ', 'HAR', 7, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (53, 'Havanna Club 3 Jahre', 'HA3', 7, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (54, 'Havanna Club 7 Jahre', 'HA7', 7, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (55, 'Malibu', 'MAL', 7, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (56, 'Myers Rum', 'MYE', 7, null, null)
on conflict do nothing;
-- 8
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (57, 'Bombay Gin', 'GIN', 8, null, null)
on conflict do nothing;
-- 9
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (58, 'Martini', 'MAR', 9, null, null)
on conflict do nothing;
-- 10
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (59, 'Becks', 'BEX', 10, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (60, 'Becks Alkoholfrei', 'BEXA', 10, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (61, 'Becks Gold', 'BEXG', 10, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (62, 'Becks Ice', 'BEXI', 10, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (63, 'Becks Green Lemon', 'BEXL', 10, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (64, 'Jever', 'JEV', 10, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (65, 'Vitamalz', 'VIT', 10, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (66, 'Warsteiner', 'WAR', 10, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (67, 'Budweiser', 'BUD', 10, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (68, 'Desperados', 'DES', 10, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (69, 'Franziskaner Naturtrüb', 'FH', 10, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (70, 'Franziskaner Dunkel', 'FD', 10, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (71, 'Franziskaner Kristall', 'FK', 10, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (72, 'Erdinger Alkoholfrei', 'EA', 10, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (73, 'Paulaner Alkoholfrei Zitrone', 'PAZ', 10, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (74, 'Bananenweizen', 'BW', 10, null, null)
on conflict do nothing;
-- TODO Alkoholfreies Bananenweizen not listed - but hint from service
-- 11
-- Currently - Becks from barrel are listed as own drinks 04 and 05 -- 04A oder 05A -
-- in our definition, they would be categories or variants from one drink
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (75, 'Becks', 'BexF', 11, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (76, 'Alster', 'Al', 11, null, null)
on conflict do nothing;
-- Hint: Multiple on menu ?
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (77, 'Pitcher Becks', 'PIT', 11, null, null)
on conflict do nothing;
-- 12
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (78, 'Kaffee', 'CAF', 12, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
    -- Hint: Different sorts listed as own drinks - and category ?
-- TODO Discuss with Piet?
values (79, 'Tee', 'Tee', 12, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (80, 'Kakao', 'KAK', 12, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (81, 'Espresso', 'ESP', 12, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (82, 'Cafe au lait', 'CAL', 12, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (83, 'Cappuccino', 'CAP', 12, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (84, 'Moccacino', 'MOC', 12, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (85, 'Latte Macchiato', 'LM', 12, null, null)
on conflict do nothing;
-- 13
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (86, 'Berenzen Roter', 'ROT', 13, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (87, 'Berenzen Saurer', 'SAUR', 13, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
-- ??
values (88, 'Berenzen Apfel', 'APF', 13, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (89, 'Ice Mint', 'BLA', 13, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (90, 'Grappa', 'GRA', 13, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (91, 'Strothmann Korn', 'KOR', 13, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (92, 'Springer Urvater', 'SPU', 13, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (93, 'Tequila', 'TEQ', 13, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (94, 'Waldmeister', 'GRÜ', 13, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (95, 'Williams Birne', 'WB', 13, null, null)
on conflict do nothing;
-- 14
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (96, 'Effect', 'EFF', 14, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (97, 'Red Bull', 'RB', 14, null, null)
on conflict do nothing;
-- 15
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (98, 'Fuze Ice Tea Zitrone', 'ETZ', 15, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (99, 'Fuze Ice Tea Pfirsich', 'ETP', 15, null, null)
on conflict do nothing;
-- 16
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (100, 'Ginger Ale', 'GA', 16, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (101, 'Bitter Lemon', 'BL', 16, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (102, 'Tonic Water', 'TW', 16, null, null)
on conflict do nothing;
-- 17
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (103, 'Pina Colada', 'PC', 17, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (104, 'Swimming Pool', 'SWP', 17, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (105, 'Planters Punch', 'PP', 17, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (106, 'Zombie', 'ZOM', 17, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (107, 'Mai Tai', 'MT', 17, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (108, 'Sex on the Beach', 'SOB', 17, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (109, 'Tequila Sunrise', 'TS', 17, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (110, 'Long island ice tea', 'LIT', 17, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (111, 'Tropical Mistery', 'TM', 17, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (112, 'Virgin Colada', 'VC', 17, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (113, 'Big Apple', 'BIG', 17, null, null)
on conflict do nothing;
insert into item (id, item_name, abbreviation, category, description, special_feature)
values (114, 'Red berry', 'RBY', 17, null, null)
on conflict do nothing;
-- 18
-- TODO - Tea
-- TODO - Snacks ?
