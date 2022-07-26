-- Insertions for Items-Table ordered by item-categories
-- 1
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (1, 'Cola', 'C', 1, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (2, 'Fanta', 'F', 1, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (3, 'Sprite', 'SPR', 1, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (4, 'Cola Zero', 'CZ', 1, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (5, 'Cola Light', 'CL', 1, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (6, 'Spezi', 'SPE', 1, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (7, 'Mineralwasser', 'W', 1, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (8, 'Stilles Wasser', 'STW', 1, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
-- 2
VALUES (9, 'Apfelsaft', 'AS', 2, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
-- TODO Apfelsaftschorle ? + SCH
VALUES (10, 'Orangennektar', 'OS', 2, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (11, 'Kirschnektar', 'KS', 2, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (12, 'Bananennektar', 'BS', 2, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (13, 'Maracujanektar', 'MARA', 2, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (14, 'Ananassaft', 'ANA', 2, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (15, 'Cranberrynektar', 'CRA', 2, null, null) ON CONFLICT DO NOTHING;
-- 3
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (16, 'Ballantines', 'BAL', 3, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (17, 'Canadian Club', 'CAN', 3, null, null) ON CONFLICT DO NOTHING;
-- TODO: Maybe CAC
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (18, 'Glenfiddich', 'GLE', 3, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (19, 'Jack Daniels', 'JD', 3, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (20, 'Jim Beam', 'JB', 3, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (21, 'Jim Beam Black', 'JBB', 3, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (22, 'Johnny Walker Red Label', 'JWRL', 3, null, null) ON CONFLICT DO NOTHING;
-- TODO: Maybe JRL
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (23, 'Johnny Walker Black Label', 'JWBL', 3, null, null) ON CONFLICT DO NOTHING;
-- TODO: Maybe JBL
-- 4
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (25, 'Amaretto', 'AMA', 4, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (26, 'Aperol', 'WAS', 4, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (27, 'Baileys', 'BAIL', 4, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (28, 'Batida de Coco', 'BAT', 4, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (29, 'Berliner Luft', 'BER', 4, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (30, 'Campari', 'CAM', 4, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (31, 'Dirty Harry', 'DH', 4, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (32, 'Jägermeister', 'JÄG', 4, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (33, 'Kümmerling', 'KÜM', 4, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (34, 'Licor 43', 'L43', 4, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (35, 'Ouzo', 'OUZ', 4, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (36, 'Pernod', 'PER', 4, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (37, 'Ramazotti', 'RAMA', 4, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (38, 'Sambuca White', 'SAM', 4, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (39, 'Sambuca Caffe', 'SAMC', 4, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (40, 'Southern Comfort', 'SOU', 4, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
-- 5
VALUES (41, 'Chantre', 'CHA', 5, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (42, 'Scharlachberg', 'SCH', 5, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
-- 6
VALUES (43, 'Moskovskaya', 'MOS', 6, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (44, 'Smirnoff', 'SMI', 6, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (45, 'Feigling', 'FEI', 6, null, null) ON CONFLICT DO NOTHING;
-- 7
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (46, 'Bacardi Oakheart', 'BACO', 7, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (47, 'Bacardi Razz', 'BACR', 7, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (48, 'Bacardi White', 'BAC', 7, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (49, 'Bacardi Gold', 'BACG', 7, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (50, 'Bacardi Black', 'BACB', 7, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (51, 'Captain Morgan', 'CM', 7, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (52, 'Hansen Rum ', 'HAR', 7, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (53, 'Havanna Club 3 Jahre', 'HA3', 7, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (54, 'Havanna Club 7 Jahre', 'HA7', 7, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (55, 'Malibu', 'MAL', 7, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (56, 'Myers Rum', 'MYE', 7, null, null) ON CONFLICT DO NOTHING;
-- 8
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (57, 'Bombay Gin', 'GIN', 8, null, null) ON CONFLICT DO NOTHING;
-- 9
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (58, 'Martini', 'MAR', 9, null, null) ON CONFLICT DO NOTHING;
-- 10
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (59, 'Becks', 'BEX', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (60, 'Becks Alkoholfrei', 'BEXA', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (61, 'Becks Gold', 'BEXG', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (62, 'Becks Ice', 'BEXI', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (63, 'Becks Green Lemon', 'BEXL', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (64, 'Jever', 'JEV', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (65, 'Vitamalz', 'VIT', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (66, 'Warsteiner', 'WAR', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (67, 'Budweiser', 'BUD', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (68, 'Desperados', 'DES', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (69, 'Franziskaner Naturtrüb', 'FH', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (70, 'Franziskaner Dunkel', 'FD', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (71, 'Franziskaner Kristall', 'FK', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (72, 'Erdinger Alkoholfrei', 'EA', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (73, 'Paulaner Alkoholfrei Zitrone', 'PAZ', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (74, 'Bananenweizen', 'BW', 10, null, null) ON CONFLICT DO NOTHING;
-- TODO Alkoholfreies Bananenweizen not listed - but hint from service
-- 11
-- Currently - Becks from barrel are listed as own drinks 04 and 05 -- 04A oder 05A -
-- in our definition, they would be categories or variants from one drink
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (75, 'Becks', 'BexF', 11, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (76, 'Alster', 'Al', 11, null, null) ON CONFLICT DO NOTHING;
-- Hint: Multiple on menu ?
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (77, 'Pitcher Becks', 'PIT', 11, null, null) ON CONFLICT DO NOTHING;
-- 12
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (78, 'Kaffee', 'CAF', 12, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
    -- Hint: Different sorts listed as own drinks - and category ?
-- TODO Discuss with Piet?
VALUES (79, 'Tee', 'Tee', 12, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (80, 'Kakao', 'KAK', 12, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (81, 'Espresso', 'ESP', 12, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (82, 'Cafe au lait', 'CAL', 12, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (83, 'Cappuchino', 'CAP', 12, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (84, 'Moccacino', 'MOC', 12, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (85, 'Latte Macchiato', 'LM', 12, null, null) ON CONFLICT DO NOTHING;
-- 13
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (86, 'Berenzen Roter', 'ROT', 13, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (87, 'Berenzen Saurer', 'SAUR', 13, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
-- ??
VALUES (88, 'Berenzen Apfel', 'APF', 13, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (89, 'Ice Mint', 'BLA', 13, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (90, 'Grappa', 'GRA', 13, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (91, 'Strothmann Korn', 'KOR', 13, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (92, 'Springer Urvater', 'SPU', 13, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (93, 'Tequila', 'TEQ', 13, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (94, 'Waldmeister', 'GRÜ', 13, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (95, 'Williams Birne', 'WB', 13, null, null) ON CONFLICT DO NOTHING;
-- 14
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (96, 'Effect', 'EFF', 14, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (97, 'Red Bull', 'RB', 14, null, null) ON CONFLICT DO NOTHING;
-- 15
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (98, 'Fuze Ice Tea Zitrone', 'ETZ', 15, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (99, 'Fuze Ice Tea Pfirsich', 'ETP', 15, null, null) ON CONFLICT DO NOTHING;
-- 16
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (100, 'Ginger Ale', 'GA', 16, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (101, 'Bitter Lemon', 'BL', 16, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (102, 'Tonic Water', 'TW', 16, null, null) ON CONFLICT DO NOTHING;
-- 17
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (103, 'Pina Colada', 'PC', 17, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (104, 'Swimming Pool', 'SWP', 17, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (105, 'Planters Punch', 'PP', 17, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (106, 'Zombie', 'ZOM', 17, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (107, 'Mai Tai', 'MT', 17, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (108, 'Sex on the Beach', 'SOB', 17, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (109, 'Tequila Sunrise', 'TS', 17, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (110, 'Long island ice tea', 'LIT', 17, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (111, 'Tropical Mistery', 'TM', 17, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (112, 'Virgin Colada', 'VC', 17, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (113, 'Big Apple', 'BIG', 17, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (114, 'Red berry', 'RBY', 17, null, null) ON CONFLICT DO NOTHING;
-- 18
-- TODO - Tea
-- TODO - Snacks ?