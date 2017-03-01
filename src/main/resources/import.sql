INSERT INTO cin_screen (cin_screen_capacity) VALUES (10);
INSERT INTO cin_screen (cin_screen_capacity) VALUES (10);

INSERT INTO cin_seat_type (type_name, type_price) VALUES ('STANDARD', '10.00');
INSERT INTO cin_seat_type (type_name, type_price) VALUES ('PREMIER', '15.00');
INSERT INTO cin_seat_type (type_name, type_price) VALUES ('DISABLED', '5.00');

INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (1, 'A', 3, 1);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (2, 'A', 3, 1);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (3, 'B', 1, 1);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (4, 'B', 1, 1);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (5, 'C', 1, 1);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (6, 'C', 1, 1);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (7, 'D', 1, 1);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (8, 'D', 1, 1);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (9, 'E', 2, 1);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (10, 'E', 2, 1);

INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (11, 'A', 3, 2);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (12, 'A', 3, 2);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (13, 'B', 1, 2);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (14, 'B', 1, 2);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (15, 'C', 1, 2);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (16, 'C', 1, 2);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (17, 'D', 1, 2);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (18, 'D', 1, 2);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (19, 'E', 2, 2);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (20, 'E', 2, 2);

INSERT INTO cin_booking(booking_complete, booking_paypal) VALUES (true, 'examplepaypal1');
INSERT INTO cin_booking(booking_complete, booking_paypal) VALUES (true, 'examplepaypal2');

INSERT INTO cin_film (film_3D, film_cast, film_certification, film_director, film_duration, film_genre, film_release_date, film_summary, film_title) VALUES(false, 'cast', 'PG', 'director', 120, 'genre', '18-06-17', 'summary', 'title');
INSERT INTO cin_film (film_3D, film_cast, film_certification, film_director, film_duration, film_genre, film_release_date, film_summary, film_title) VALUES(false, 'cas2t', 'PG', 'direct2or', 100, 'genr2e', '18-07-17', 'summary', 'titasdle');
INSERT INTO cin_film (film_3D, film_cast, film_certification, film_director, film_duration, film_genre, film_release_date, film_summary, film_title) VALUES(true, 'cast example 3', 'PG', 'many directors', 140, 'action', '18-02-17', 'summary', 'actiona title');

INSERT INTO cin_showing(showing_start_time, showing_screen_id, showing_film_id) VALUES ('04-03-17 12:10:08', 1, 3);
INSERT INTO cin_showing(showing_start_time, showing_screen_id, showing_film_id) VALUES ('04-03-17 16:10:08', 1, 3);
INSERT INTO cin_showing(showing_start_time, showing_screen_id, showing_film_id) VALUES ('05-03-17 12:10:08', 1, 3);
INSERT INTO cin_showing(showing_start_time, showing_screen_id, showing_film_id) VALUES ('05-03-17 16:10:08', 1, 3);
INSERT INTO cin_showing(showing_start_time, showing_screen_id, showing_film_id) VALUES ('06-03-17 12:10:08', 1, 3);
INSERT INTO cin_showing(showing_start_time, showing_screen_id, showing_film_id) VALUES ('06-03-17 16:10:08', 1, 3);
INSERT INTO cin_showing(showing_start_time, showing_screen_id, showing_film_id) VALUES ('07-03-17 12:10:08', 1, 3);
INSERT INTO cin_showing(showing_start_time, showing_screen_id, showing_film_id) VALUES ('07-03-17 16:10:08', 1, 3);

INSERT INTO cin_showing(showing_start_time, showing_screen_id, showing_film_id) VALUES ('04-03-17 12:10:08', 2, 3);
INSERT INTO cin_showing(showing_start_time, showing_screen_id, showing_film_id) VALUES ('04-03-17 16:10:08', 2, 3);
INSERT INTO cin_showing(showing_start_time, showing_screen_id, showing_film_id) VALUES ('05-03-17 12:10:08', 2, 3);
INSERT INTO cin_showing(showing_start_time, showing_screen_id, showing_film_id) VALUES ('05-03-17 16:10:08', 2, 3);
INSERT INTO cin_showing(showing_start_time, showing_screen_id, showing_film_id) VALUES ('06-03-17 12:10:08', 2, 3);
INSERT INTO cin_showing(showing_start_time, showing_screen_id, showing_film_id) VALUES ('06-03-17 16:10:08', 2, 3);
INSERT INTO cin_showing(showing_start_time, showing_screen_id, showing_film_id) VALUES ('07-03-17 12:10:08', 2, 3);
INSERT INTO cin_showing(showing_start_time, showing_screen_id, showing_film_id) VALUES ('07-03-17 16:10:08', 2, 3);

INSERT INTO cin_ticket(ticket_booking_id, ticket_showing_id, ticket_seat_id, ticket_type) VALUES (1, 1, 3, 'ADULT');
INSERT INTO cin_ticket(ticket_booking_id, ticket_showing_id, ticket_seat_id, ticket_type) VALUES (1, 1, 4, 'ADULT');
INSERT INTO cin_ticket(ticket_booking_id, ticket_showing_id, ticket_seat_id, ticket_type) VALUES (1, 1, 5, 'ADULT');
INSERT INTO cin_ticket(ticket_booking_id, ticket_showing_id, ticket_seat_id, ticket_type) VALUES (1, 1, 6, 'ADULT');

INSERT INTO cin_ticket(ticket_booking_id, ticket_showing_id, ticket_seat_id, ticket_type) VALUES (2, 11, 3, 'ADULT');
INSERT INTO cin_ticket(ticket_booking_id, ticket_showing_id, ticket_seat_id, ticket_type) VALUES (2, 11, 4, 'ADULT');
INSERT INTO cin_ticket(ticket_booking_id, ticket_showing_id, ticket_seat_id, ticket_type) VALUES (2, 11, 5, 'ADULT');
INSERT INTO cin_ticket(ticket_booking_id, ticket_showing_id, ticket_seat_id, ticket_type) VALUES (2, 11, 6, 'ADULT');