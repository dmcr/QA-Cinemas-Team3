
insert into cin_seat(seat_id, seat_row, seat_number, seat_type_id, seat_screen_id) values
(1, "A", 1, 1, 1);

INSERT INTO cin_screen (screen_id, screen_type_id, cin_screen_capacity) VALUES (1, 1, 500);

insert into cin_seat_type (type_id, type_price, type_name) values (1, 'Standard', 10.00);

INSERT INTO cin_ticket(ticket_id, ticket_showing_id, tocket_booking_id, ticket_type, ticket_seat_id) VALUES (1, 1, 1, 'adult', 1);

INSERT INTO cin_booking(booking_id, booking_complete, booking_paypal) VALUES (1, true, 'example2335');

INSERT INTO cin_film (film_id, film_title, film_summary, film_duration, file_genre, film_certification, film_3D, film_release_date, film_director, film_cast) VALUES(1, 'ATitle', 'ASummary', 120, 'Action', 'PG', false, '2017-03-12', 'ADirector', 'ACast');

INSERT INTO cin_showing(showing_id, showing_film_id, showing_start_time, showing_screen_id) VALUES (1, 1, '18-06-17 10:34:09 PM', 1);