DROP DATABASE stocks;
CREATE DATABASE stocks;

/* creates a table to store a list of hobbies and their recommended ages */
DROP TABLE if EXISTS stocks.stocksjaxb CASCADE;
CREATE TABLE stocks.stocksjaxb(
	id INT NOT NULL AUTO_INCREMENT,
	symbol VARCHAR(4) NOT NULL,
	time VARCHAR(50) NOT NULL,
	price VARCHAR(50) NOT NULL,
	PRIMARY KEY ( id )
);
