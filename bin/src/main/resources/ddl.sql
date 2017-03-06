--<ScriptOptions statementTerminator=";"/>

ALTER TABLE `cinemasimplified`.`cin_booking` DROP PRIMARY KEY;

ALTER TABLE `cinemasimplified`.`cin_film` DROP PRIMARY KEY;

ALTER TABLE `cinemasimplified`.`cin_ticket` DROP PRIMARY KEY;

ALTER TABLE `cinemasimplified`.`cin_screen` DROP PRIMARY KEY;

ALTER TABLE `cinemasimplified`.`cin_showing` DROP PRIMARY KEY;

ALTER TABLE `cinemasimplified`.`cin_seat_type` DROP PRIMARY KEY;

ALTER TABLE `cinemasimplified`.`cin_seat` DROP PRIMARY KEY;

ALTER TABLE `cinemasimplified`.`cin_seat` DROP INDEX `cinemasimplified`.`fk_cin_seat_cin_seat_type1_idx`;

ALTER TABLE `cinemasimplified`.`cin_ticket` DROP INDEX `cinemasimplified`.`ticket_seat_id_idx`;

ALTER TABLE `cinemasimplified`.`cin_ticket` DROP INDEX `cinemasimplified`.`ticket_booking_id_idx`;

ALTER TABLE `cinemasimplified`.`cin_ticket` DROP INDEX `cinemasimplified`.`ticket_showing_id_idx`;

ALTER TABLE `cinemasimplified`.`cin_seat` DROP INDEX `cinemasimplified`.`seat_screen_id_idx`;

ALTER TABLE `cinemasimplified`.`cin_film` DROP INDEX `cinemasimplified`.`film_id_UNIQUE`;

ALTER TABLE `cinemasimplified`.`cin_showing` DROP INDEX `cinemasimplified`.`film_time_id_UNIQUE`;

ALTER TABLE `cinemasimplified`.`cin_showing` DROP INDEX `cinemasimplified`.`fk_cin_showing_cin_screen1_idx`;

ALTER TABLE `cinemasimplified`.`cin_screen` DROP INDEX `cinemasimplified`.`screen_id_UNIQUE`;

ALTER TABLE `cinemasimplified`.`cin_showing` DROP INDEX `cinemasimplified`.`showing_film_id_idx`;

ALTER TABLE `cinemasimplified`.`cin_seat_type` DROP INDEX `cinemasimplified`.`price_id_UNIQUE`;

ALTER TABLE `cinemasimplified`.`cin_booking` DROP INDEX `cinemasimplified`.`booking_id_UNIQUE`;

ALTER TABLE `cinemasimplified`.`cin_ticket` DROP INDEX `cinemasimplified`.`ticket_id_UNIQUE`;

ALTER TABLE `cinemasimplified`.`cin_seat` DROP INDEX `cinemasimplified`.`seat_id_UNIQUE`;

DROP TABLE `cinemasimplified`.`cin_film`;

DROP TABLE `cinemasimplified`.`cin_booking`;

DROP TABLE `cinemasimplified`.`cin_showing`;

DROP TABLE `cinemasimplified`.`cin_seat_type`;

DROP TABLE `cinemasimplified`.`cin_seat`;

DROP TABLE `cinemasimplified`.`cin_ticket`;

DROP TABLE `cinemasimplified`.`cin_screen`;

CREATE TABLE `cinemasimplified`.`cin_film` (
	`film_id` INT NOT NULL,
	`film_title` VARCHAR(45) NOT NULL,
	`film_summary` VARCHAR(250) NOT NULL,
	`film_duration` INT NOT NULL,
	`film_genre` VARCHAR(45) NOT NULL,
	`film_certification` ENUM NOT NULL,
	`film_3D` BIT NOT NULL,
	`film_release_date` DATE NOT NULL,
	`film_director` VARCHAR(45) NOT NULL,
	`film_cast` VARCHAR(240) NOT NULL,
	`film_IMDBID` VARCHAR(45),
	PRIMARY KEY (`film_id`)
) ENGINE=InnoDB;

CREATE TABLE `cinemasimplified`.`cin_booking` (
	`booking_id` INT NOT NULL,
	`booking_complete` BIT NOT NULL,
	`booking_paypal` INT NOT NULL,
	PRIMARY KEY (`booking_id`,`booking_paypal`)
) ENGINE=InnoDB;

CREATE TABLE `cinemasimplified`.`cin_showing` (
	`showing_id` INT NOT NULL,
	`showing_film_id` INT NOT NULL,
	`showing_start_time` DATETIME NOT NULL,
	`showing_screen_id` INT NOT NULL,
	PRIMARY KEY (`showing_id`)
) ENGINE=InnoDB;

CREATE TABLE `cinemasimplified`.`cin_seat_type` (
	`type_id` INT NOT NULL,
	`type_price` DECIMAL(10 , 0) NOT NULL,
	`type_name` ENUM NOT NULL,
	PRIMARY KEY (`type_id`)
) ENGINE=InnoDB;

CREATE TABLE `cinemasimplified`.`cin_seat` (
	`seat_id` INT NOT NULL,
	`seat_row` VARCHAR(2) NOT NULL,
	`seat_number` INT NOT NULL,
	`seat_type_id` INT NOT NULL,
	`seat_screen_id` INT NOT NULL,
	PRIMARY KEY (`seat_id`)
) ENGINE=InnoDB;

CREATE TABLE `cinemasimplified`.`cin_ticket` (
	`ticket_id` INT NOT NULL,
	`ticket_showing_id` INT NOT NULL,
	`ticket_booking_id` INT NOT NULL,
	`ticket_type` ENUM NOT NULL,
	`ticket_seat_id` INT NOT NULL,
	PRIMARY KEY (`ticket_id`)
) ENGINE=InnoDB;

CREATE TABLE `cinemasimplified`.`cin_screen` (
	`screen_id` INT NOT NULL,
	`screen_type_id` INT NOT NULL,
	`cin_screen_capacity` INT NOT NULL,
	PRIMARY KEY (`screen_id`)
) ENGINE=InnoDB;

CREATE INDEX `fk_cin_seat_cin_seat_type1_idx` ON `cinemasimplified`.`cin_seat` (`seat_type_id` ASC);

CREATE INDEX `ticket_seat_id_idx` ON `cinemasimplified`.`cin_ticket` (`ticket_seat_id` ASC);

CREATE INDEX `ticket_booking_id_idx` ON `cinemasimplified`.`cin_ticket` (`ticket_booking_id` ASC);

CREATE INDEX `ticket_showing_id_idx` ON `cinemasimplified`.`cin_ticket` (`ticket_showing_id` ASC);

CREATE INDEX `seat_screen_id_idx` ON `cinemasimplified`.`cin_seat` (`seat_screen_id` ASC);

CREATE UNIQUE INDEX `film_id_UNIQUE` ON `cinemasimplified`.`cin_film` (`film_id` ASC);

CREATE UNIQUE INDEX `film_time_id_UNIQUE` ON `cinemasimplified`.`cin_showing` (`showing_id` ASC);

CREATE INDEX `fk_cin_showing_cin_screen1_idx` ON `cinemasimplified`.`cin_showing` (`showing_screen_id` ASC);

CREATE UNIQUE INDEX `screen_id_UNIQUE` ON `cinemasimplified`.`cin_screen` (`screen_id` ASC);

CREATE INDEX `showing_film_id_idx` ON `cinemasimplified`.`cin_showing` (`showing_film_id` ASC);

CREATE UNIQUE INDEX `price_id_UNIQUE` ON `cinemasimplified`.`cin_seat_type` (`type_id` ASC);

CREATE UNIQUE INDEX `booking_id_UNIQUE` ON `cinemasimplified`.`cin_booking` (`booking_id` ASC);

CREATE UNIQUE INDEX `ticket_id_UNIQUE` ON `cinemasimplified`.`cin_ticket` (`ticket_id` ASC);

CREATE UNIQUE INDEX `seat_id_UNIQUE` ON `cinemasimplified`.`cin_seat` (`seat_id` ASC);

