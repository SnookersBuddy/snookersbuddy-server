-- Insertions for Assignment-Table
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (1, 'Billard 1', '1', false)
    ON CONFLICT DO NOTHING;
INSERT INTO assignment (id, assignment_name, abbreviation, custom)
VALUES (2, 'Billard 2', '2', false)
    ON CONFLICT DO NOTHING;
