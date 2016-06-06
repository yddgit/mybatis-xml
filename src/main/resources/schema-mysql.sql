DROP TABLE IF EXISTS t_city;
CREATE TABLE t_city (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(255),
	state VARCHAR(255),
	country VARCHAR(255)
);

DROP TABLE IF EXISTS t_hotel;
CREATE TABLE t_hotel (
	city INT,
	name VARCHAR(255),
	address VARCHAR(255),
	zip VARCHAR(255)
);