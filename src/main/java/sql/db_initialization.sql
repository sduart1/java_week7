CREATE DATABASE jaxb_stocks;

/* creates a table to store a list of hobbies and their recommended ages */
CREATE TABLE jaxb_stocks.stocksjaxb(
	id INT NOT NULL AUTO_INCREMENT,
	symbol VARCHAR(4) NOT NULL,
	time VARCHAR(50) NOT NULL,
	price VARCHAR(50) NOT NULL,
	PRIMARY KEY ( id )
);

/** now add some sample data */
INSERT INTO stocks.stocksjaxb (symbol,time,price) VALUES ('GOOG','2004-08-19 00:00:01','85.00');
INSERT INTO stocks.stocksjaxb (symbol,time,price) VALUES ('GOOG','2015-02-03 00:00:01','527.35');
INSERT INTO stocks.stocksjaxb (symbol,time,price) VALUES ('APPL','2000-01-01 00:00:01','118.27');
INSERT INTO stocks.stocksjaxb (symbol,time,price) VALUES ('AMZN','2015-02-03 00:00:01','363.21');

