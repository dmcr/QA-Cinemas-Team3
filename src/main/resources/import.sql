
insert into cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) values
(1, "A", 2, 1);

insert into cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) values
(10, "AA", 1, 10);

insert into cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) values
(1, "xx", 1, 3);

insert into cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) values
(11, "A", 2, 1);

INSERT INTO cin_screen (screen_type_id,cin_screen_capacity) VALUES ('2','100');

insert into cin_seat_type (type_name, type_price) values ('Standard', '10.00');
insert into cin_seat_type (type_name, type_price) values ('Premier', '15.00');

INSERT INTO cin_ticket(ticket_showing_id, tocket_booking_id, ticket_type, ticket_seat_id) VALUES (1, 1, 'adult', 1);

INSERT INTO cin_booking(booking_complete, booking_paypal) VALUES (true, 'example2335');

INSERT INTO cin_film (film_title, film_summary, film_duration, file_genre, film_certification, film_3D, film_release_date, film_director, film_cast) VALUES('ATitle', 'ASummary', 120, 'Action', 'PG', false, '2017-03-12', 'ADirector', 'ACast');

INSERT INTO cin_showing(showing_film_id, showing_start_time, showing_screen_id) VALUES (1, '18-06-17 10:34:09 PM', 1);