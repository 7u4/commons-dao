alter sequence sender_case_id_seq
    restart with 1;
INSERT INTO sender_case (id, send_case, project_id, enabled)
VALUES (1, 'ALWAYS', 1, true);

INSERT INTO recipients(sender_case_id, recipient) VALUES (1, 'first');
INSERT INTO recipients(sender_case_id, recipient) VALUES (1, 'second');