


INSERT INTO cin_screen (cin_screen_capacity, screen_type_id) VALUES (500, 1);

INSERT INTO cin_seat_type (type_name, type_price) VALUES ('Standard', 10.00);

INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (1, 'A', 1, 1);



INSERT INTO cin_booking(booking_complete, booking_paypal) VALUES (true, 'example2335');

INSERT INTO cin_film (film_3D, film_cast, film_certification, film_director, film_duration, film_genre, film_release_date, film_summary, film_title) VALUES(false, 'cast', 'PG', 'director', 120, 'genre', '18-06-17', 'summary', 'title');

INSERT INTO cin_showing(showing_start_time, showing_screen_id, showing_film_id) VALUES ('18-06-17 12:10:08', 1, 1);

INSERT INTO cin_ticket(ticket_booking_id, ticket_showing_id, ticket_seat_id) VALUES (1, 1, 1);