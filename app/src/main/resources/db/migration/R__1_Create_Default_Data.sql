-- Insertions for Assignment-Table
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (1, 'Billard 1', '1', false);
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (2, 'Billard 2', '2', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (3, 'Billard 3', '3', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (4, 'Billard 4', '4', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (5, 'Billard 5', '5', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (6, 'Billard 6', '6', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (7, 'Billard 7', '7', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (8, 'Billard 8', '8', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (9, 'Billard 9', '9', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (10, 'Billard 10', '10', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (11, 'Snooker 1 (Billard 11)', '11', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (12, 'Snooker 2 (Billard 12)', '12', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (13, 'Esstisch 1', 'E1', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (14, 'Esstisch 2', 'E2', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (15, 'Esstisch 3', 'E3', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (16, 'Esstisch 4', 'E4', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (17, 'Esstisch 5', 'E5', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (18, 'Darts 1', 'D1', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (19, 'Darts 2', 'D2', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (20, 'Darts 3', 'D3', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (21, 'Couchtisch 1', 'C1', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (22, 'Couchtisch 2', 'C2', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (23, 'Eckbank links', 'Ebl', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (24, 'Eckbank rechts', 'Ebr', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (25, 'Kicker', 'K', false) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (26, 'Thore', 'Thore', true) ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (27, 'Rainer W', 'Rainer W', true) ON CONFLICT DO NOTHING;


-- Insertions for Items-Table
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
-- Apfelsaftschorle ? + SCH
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
-- TODO: Vlt auch CAC
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
-- TODO: Vlt auch JRL
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (23, 'Johnny Walker Black Label', 'JWBL', 3, null, null) ON CONFLICT DO NOTHING;
-- TODO: Vlt auch JBL
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
VALUES (40, 'Southern Comfort', 'SC', 4, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
-- 5
VALUES (41, 'Chantre', 'Ch', 5, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (42, 'Scharlachberg', 'Scha', 5, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
-- 6
VALUES (43, 'Moskovskaya', 'Mo', 6, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (44, 'Smirnoff', 'Smir', 6, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (45, 'Feigling', 'Feig', 6, null, null) ON CONFLICT DO NOTHING;
-- 7
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (46, 'Bacardi Oakheart', 'Oak', 7, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (47, 'Bacardi Razz', 'Razz', 7, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (48, 'Bacardi White', 'BacW', 7, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (49, 'Bacardi Gold', 'BacG', 7, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (50, 'Bacardi Black', 'BackB', 7, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (51, 'Captain Morgan', 'CM', 7, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (52, 'Hansen Rum ', 'Hans', 7, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (53, 'Havanna Club 3 Jahre', 'Hav3', 7, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (54, 'Havanna Club 7 Jahre', 'Hav7', 7, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (55, 'Malibu', 'Mal', 7, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (56, 'Meyers Rum', 'Mey', 7, null, null) ON CONFLICT DO NOTHING;
-- 8
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (57, 'Bombay Gin', 'Bom', 8, null, null) ON CONFLICT DO NOTHING;
-- 9
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (58, 'Martini', 'Mar', 9, null, null) ON CONFLICT DO NOTHING;
-- 10
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (59, 'Becks', 'Bex', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (60, 'Becks Alkoholfrei', 'BexA', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (61, 'Becks Gold', 'BexG', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (62, 'Becks Ice', 'BexI', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (63, 'Becks Green Lemon', 'BexG', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (64, 'Jever', 'Jev', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (65, 'Vitamalz', 'Vit', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (66, 'Warsteiner', 'War', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (67, 'Budweiser', 'Bud', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (68, 'Desperados', 'Des', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (69, 'Franziskaner Naturtrüb', 'FH', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (70, 'Franziskaner Dunkel', 'FHD', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (71, 'Franziskaner Kristall', 'FHK', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (72, 'Erdinger Alkoholfrei', 'EA', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (73, 'Paulaner Alkoholfrei Zitrone', 'PAZ', 10, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (74, 'Bananenweizen', 'BaW', 10, null, null) ON CONFLICT DO NOTHING;
-- 11
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (75, 'Becks', 'BexF', 11, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (76, 'Alster', 'Al', 11, null, null) ON CONFLICT DO NOTHING;
-- Anmerkung: Auf Karte mehrere - Unterschied ?
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (77, 'Pitcher Becks', 'PitBex', 11, null, null) ON CONFLICT DO NOTHING;
-- 12
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (78, 'Kaffee', 'Kaff', 12, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
-- Anmerkung: Sorten auflisten oder als Option/Variante ?
VALUES (79, 'Tee', 'Tee', 12, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (80, 'Kakao', 'Kakao', 12, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (81, 'Espresso', 'Ess', 12, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (82, 'Cafe au lait', 'Cauf', 12, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (83, 'Cappuchino', 'Capp', 12, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (84, 'Moccacino', 'Moc', 12, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (85, 'Latte Macchiato', 'Macc', 12, null, null) ON CONFLICT DO NOTHING;
-- 13
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (86, 'Berenzen Roter', 'Rot', 13, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (87, 'Berenzen Saurer', 'Saur', 13, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (88, 'Berenzen Apfel', 'Apf', 13, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (89, 'Ice Mint', 'Blau', 13, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (90, 'Grappa', 'Grap', 13, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (91, 'Strothmann Korn', 'Kor', 13, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (92, 'Springer Urvater', 'Spri', 13, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (93, 'Tequila', 'Teq', 13, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (94, 'Waldmeister', 'Wald', 13, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (95, 'Williams Birne', 'Will', 13, null, null) ON CONFLICT DO NOTHING;
-- 14
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (96, 'Effect', 'Eff', 14, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (97, 'Red Bull', 'RB', 14, null, null) ON CONFLICT DO NOTHING;
-- 15
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (98, 'Fuze Ice Tea Zitrone', 'FuzeZ', 15, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (99, 'Fuze Ice Tea Pfirsich', 'FuzeP', 15, null, null) ON CONFLICT DO NOTHING;
-- 16
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (100, 'Ginger Ale', 'Ging', 16, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (101, 'Bitter Lemon', 'BitterL', 16, null, null) ON CONFLICT DO NOTHING;
INSERT INTO items (id, item_name, abbreviation, category, description, special_feature)
VALUES (102, 'Tonic Water', 'Tonic', 16, null, null) ON CONFLICT DO NOTHING;
