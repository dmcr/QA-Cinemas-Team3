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
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (0, 'ANY', 1, 1);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (0, 'ANY', 2, 1);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (0, 'ANY', 3, 1);

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
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (0, 'ANY', 1, 2);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (0, 'ANY', 2, 2);
INSERT INTO cin_seat(seat_number, seat_row, seat_type_id, seat_screen_id) VALUES (0, 'ANY', 3, 2);

INSERT INTO cin_booking(booking_complete, booking_paypal) VALUES (true, 'examplepaypal1');
INSERT INTO cin_booking(booking_complete, booking_paypal) VALUES (true, 'examplepaypal2');
INSERT INTO cin_film (film_3D, film_cast, film_certification, film_director, film_duration, film_genre, film_release_date, film_summary, film_title, film_IMDBID, film_poster, film_rating, film_trailer, film_showing) VALUES(false, 'Leonardo DiCaprio, Joseph Gordon-Levitt, Ellen Page, Tom Hardy', 'PG', 'Christopher Nolan', 148, 'Action, Adventure, Sci-Fi', '2010-07-16', 'A thief, who steals corporate secrets through use of dream-sharing technology, is given the inverse task of planting an idea into the mind of a CEO.', 'Inception', 'tt1375666','https://images-na.ssl-images-amazon.com/images/M/MV5BMjAxMzY3NjcxNF5BMl5BanBnXkFtZTcwNTI5OTM0Mw@@._V1_SX300.jpg', '10', 'https://youtu.be/YoHD9XEInc0', true);


INSERT INTO cin_film (film_3D, film_cast, film_certification, film_director, film_duration, film_genre, film_release_date, film_summary, film_title, film_IMDBID, film_poster, film_rating, film_trailer, film_showing) VALUES(false, 'Hugh Jackman, Patrick Stewart, Dafne Keen, Boyd Holbrook', 'EIGHTEEN', 'James Mangold', 135, 'Action, Drama, Sci-Fi', '2017-03-03', 'In the near future, a weary Logan cares for an ailing Professor X in a hide out on the Mexican border. But Logans attempts to hide from the world and his legacy are up-ended when a young mutant arrives, being pursued by dark forces.', 'Logan', 'tt3315342', 'https://images-na.ssl-images-amazon.com/images/M/MV5BMjI1MjkzMjczMV5BMl5BanBnXkFtZTgwNDk4NjYyMTI@._V1_SX300.jpg', '5', 'https://youtu.be/YoHD9XEInc0', true);

INSERT INTO cin_film (film_3D, film_cast, film_certification, film_director, film_duration, film_genre, film_release_date, film_summary, film_title, film_IMDBID, film_poster, film_rating, film_trailer, film_showing) VALUES(false, 'Felicity Jones, Diego Luna, Alan Tudyk, Donnie Yen', 'PG', 'Gareth Edwards', 133, 'Action, Adventure, Sci-Fi', '2016-12-16', 'The Rebel Alliance makes a risky move to steal the plans for the Death Star, setting up the epic saga to follow.', 'Rogue One', 'tt3748528', 'https://images-na.ssl-images-amazon.com/images/M/MV5BMjEwMzMxODIzOV5BMl5BanBnXkFtZTgwNzg3OTAzMDI@._V1_SX300.jpg', '2', 'https://youtu.be/YoHD9XEInc0', true);

INSERT INTO cin_film (film_3D, film_cast, film_certification, film_director, film_duration, film_genre, film_release_date, film_summary, film_title, film_IMDBID, film_poster, film_rating, film_trailer, film_showing) VALUES(false, 'Alan Howard, Noel Appleby, Sean Astin, Sala Baker', 'PG', 'Peter Jackson', 178, 'Adventure, Drama, Fantasy', '2001-12-19', 'A meek Hobbit from the Shire and eight companions set out on a journey to destroy the powerful One Ring and save Middle Earth from the Dark Lord Sauron.', 'The Lord of the Rings: The Fellowship of the Ring', 'tt0120737', 'https://images-na.ssl-images-amazon.com/images/M/MV5BNmFmZDdkODMtNzUyMy00NzhhLWFjZmEtMGMzYjNhMDA1NTBkXkEyXkFqcGdeQXVyNDUyOTg3Njg@._V1_SX300.jpg', '4', 'https://youtu.be/YoHD9XEInc0', true);

INSERT INTO cin_film (film_3D, film_cast, film_certification, film_director, film_duration, film_genre, film_release_date, film_summary, film_title, film_IMDBID, film_poster, film_rating, film_trailer, film_showing) VALUES(false, 'Roy Scheider, Robert Shaw, Richard Dreyfuss, Lorraine Gary', 'PG', 'Steven Spielberg', 124, 'Adventure, Drama, Thriller', '1975-06-20', 'A giant great white shark arrives on the shores of a New England beach resort and wreaks havoc with bloody attacks on swimmers, until a part-time sheriff teams up with a marine biologist and an old seafarer to hunt the monster down.', 'Jaws', 'tt0073195', 'https://images-na.ssl-images-amazon.com/images/M/MV5BYThiYjQwM2UtOGE1My00NzMxLTk3NzctYjhiYWRhYmZhZjZmL2ltYWdlXkEyXkFqcGdeQXVyNTAyODkwOQ@@._V1_SX300.jpg', '1', 'https://youtu.be/YoHD9XEInc0', true);

INSERT INTO cin_film (film_3D, film_cast, film_certification, film_director, film_duration, film_genre, film_release_date, film_summary, film_title, film_IMDBID, film_poster, film_rating, film_trailer, film_showing) VALUES(false, 'Marlon Brando, Al Pacino, James Caan, Richard S. Castellano', 'EIGHTEEN', 'Francis Ford Coppola', 175, 'Crime, Drama', '1972-03-24', 'The aging patriarch of an organized crime dynasty transfers control of his clandestine empire to his reluctant son.', 'The Godfather', 'tt0068646', 'https://images-na.ssl-images-amazon.com/images/M/MV5BZTRmNjQ1ZDYtNDgzMy00OGE0LWE4N2YtNTkzNWQ5ZDhlNGJmL2ltYWdlL2ltYWdlXkEyXkFqcGdeQXVyNjU0OTQ0OTY@._V1_SX300.jpg', '5', 'https://youtu.be/YoHD9XEInc0', true);

INSERT INTO cin_film (film_3D, film_cast, film_certification, film_director, film_duration, film_genre, film_release_date, film_summary, film_title, film_IMDBID, film_poster, film_rating, film_trailer, film_showing) VALUES(false, 'Tim Ivey, Gena Rowlands, Starletta DuPois, James Garner', 'PG', 'Nick Cassavetes', 123, 'Drama, Romance', '2004-06-25', 'A poor yet passionate young man falls in love with a rich young woman, giving her a sense of freedom, but they are soon separated because of their social differences.', 'The Notebook', 'tt0332280', 'https://images-na.ssl-images-amazon.com/images/M/MV5BMTk3OTM5Njg5M15BMl5BanBnXkFtZTYwMzA0ODI3._V1_SX300.jpg', '6', 'https://youtu.be/YoHD9XEInc0', false);

INSERT INTO cin_film (film_3D, film_cast, film_certification, film_director, film_duration, film_genre, film_release_date, film_summary, film_title, film_IMDBID, film_poster, film_rating, film_trailer, film_showing) VALUES(false, 'Aulii Cravalho, Dwayne Johnson, Rachel House, Temuera Morrison', 'PG', 'Ron Clements, Don Hall, John Musker, Chris Williams', 107, 'Animation, Adventure, Comedy', '2016-11-23', 'In Ancient Polynesia, when a terrible curse incurred by the Demigod Maui reaches an impetuous Chieftains daughters island, she answers the Oceans call to seek out the Demigod to set things right', 'Moana', 'tt3521164', 'https://images-na.ssl-images-amazon.com/images/M/MV5BMjI4MzU5NTExNF5BMl5BanBnXkFtZTgwNzY1MTEwMDI@._V1_SX300.jpg', '7', 'https://youtu.be/YoHD9XEInc0', false);



INSERT INTO cin_film (film_3D, film_cast, film_certification, film_director, film_duration, film_genre, film_release_date, film_summary, film_title, film_IMDBID, film_poster, film_rating, film_trailer, film_showing) VALUES(false, 'Vince Vaughn, Christine Taylor, Ben Stiller, Rip Torn', 'PG', 'Rawson Marshall Thurber', 92 , 'Comedy, Sport', '2009-12-25', 'A group of misfits enter a Las Vegas dodgeball tournament in order to save their cherished local gym from the onslaught of a corporate health fitness chain.', 'Dodgeball: A True Underdog Story', 'tt0364725', 'https://images-na.ssl-images-amazon.com/images/M/MV5BMTIwMzE2MjM4MV5BMl5BanBnXkFtZTYwNjA1OTY3._V1_SX300.jpg', '9', 'https://youtu.be/YoHD9XEInc0', false);
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