INSERT INTO USER(ID, VERSION, USER_NAME, PASSWORD, ROLE) VALUES(10, 0, 'admin', 'admin', 'ADMIN');
INSERT INTO USER(ID, VERSION, USER_NAME, PASSWORD, ROLE) VALUES(11, 0, 'alma', 'korte', 'USER');
INSERT INTO USER(ID, VERSION, USER_NAME, PASSWORD, ROLE) VALUES(12, 0, 'admin2', 'admin', 'ADMIN');
INSERT INTO USER(ID, VERSION, USER_NAME, PASSWORD, ROLE) VALUES(13, 0, 'anna', 'anna', 'USER');

INSERT INTO FILM(ID, VERSION, TITLE, DIRECTOR, SYNOPSIS, LENGTH) VALUES(1, 0, 'How to train your dragon', 'Dean DeBlois, Chris Sanders', 'A harpless young viking who aspires to hunt dragons becomes the unlikely friend of a young dragon himself, and learns there may be more to the creatures than he assumed.', 98);
INSERT INTO FILM(ID, VERSION, TITLE, DIRECTOR, SYNOPSIS, LENGTH) VALUES(2, 0, 'The hangover', 'Todd Phillipps', 'Three buddies wake up from a bachelor party in Las Vegas, with no memory of the previous night and the bachelor is missing. They make their way around the city in order to find their missing friend before his wedding.', 100);
INSERT INTO FILM(ID, VERSION, TITLE, DIRECTOR, SYNOPSIS, LENGTH) VALUES(3, 0, 'Titanic', 'James Cameron', 'Classic', 205);
INSERT INTO FILM(ID, VERSION, TITLE, DIRECTOR, SYNOPSIS, LENGTH) VALUES(4, 0, 'Star Wars', 'Valaki', 'Classic', 205);

INSERT INTO ROOM(ID, VERSION, NAME, ROWS_NUMBER, COLUMNS_NUMBER) VALUES(1, 0, 'Room 1', 10, 10);
INSERT INTO ROOM(ID, VERSION, NAME, ROWS_NUMBER, COLUMNS_NUMBER) VALUES(2, 0, 'Room 2', 9, 9);
INSERT INTO ROOM(ID, VERSION, NAME, ROWS_NUMBER, COLUMNS_NUMBER) VALUES(3, 0, 'Room 3', 8, 8);
INSERT INTO ROOM(ID, VERSION, NAME, ROWS_NUMBER, COLUMNS_NUMBER) VALUES(4, 0, 'Room 4', 7, 7);
INSERT INTO ROOM(ID, VERSION, NAME, ROWS_NUMBER, COLUMNS_NUMBER) VALUES(5, 0, 'Room 5', 6, 6);

INSERT INTO PERFORMANCE(ID, VERSION, STARTING_TIME, FILM_ID, ROOM_ID) VALUES(1, 0, {ts '2018-01-01 11:15:00.00'}, 1, 1);
INSERT INTO PERFORMANCE(ID, VERSION, STARTING_TIME, FILM_ID, ROOM_ID) VALUES(2, 0, {ts '2018-01-01 15:30:00.00'}, 1, 2);
INSERT INTO PERFORMANCE(ID, VERSION, STARTING_TIME, FILM_ID, ROOM_ID) VALUES(3, 0, {ts '2018-01-01 19:30:00.00'}, 1, 1);
INSERT INTO PERFORMANCE(ID, VERSION, STARTING_TIME, FILM_ID, ROOM_ID) VALUES(4, 0, {ts '2018-01-01 21:15:00.00'}, 1, 3);
INSERT INTO PERFORMANCE(ID, VERSION, STARTING_TIME, FILM_ID, ROOM_ID) VALUES(5, 0, {ts '2018-01-01 13:00:00.00'}, 2, 4);
INSERT INTO PERFORMANCE(ID, VERSION, STARTING_TIME, FILM_ID, ROOM_ID) VALUES(6, 0, {ts '2018-01-01 17:30:00.00'}, 2, 5);
INSERT INTO PERFORMANCE(ID, VERSION, STARTING_TIME, FILM_ID, ROOM_ID) VALUES(7, 0, {ts '2018-01-01 19:45:00.00'}, 2, 2);
INSERT INTO PERFORMANCE(ID, VERSION, STARTING_TIME, FILM_ID, ROOM_ID) VALUES(8, 0, {ts '2018-01-01 17:45:00.00'}, 3, 4);
INSERT INTO PERFORMANCE(ID, VERSION, STARTING_TIME, FILM_ID, ROOM_ID) VALUES(9, 0, {ts '2018-01-01 20:00:00.00'}, 3, 5);
INSERT INTO PERFORMANCE(ID, VERSION, STARTING_TIME, FILM_ID, ROOM_ID) VALUES(10, 0, {ts '2018-01-01 16:30:00.00'}, 3, 3);