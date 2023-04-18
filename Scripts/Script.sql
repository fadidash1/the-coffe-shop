create database if not exists coffee;
use coffee;

CREATE TABLE if not exists user_type (
  id INT AUTO_INCREMENT PRIMARY KEY,
  type VARCHAR(10) NOT null
);

CREATE TABLE if not exists user (
  id INT NOT NULL AUTO_INCREMENT,
  fname VARCHAR(50) NOT NULL,
  lname VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  password VARCHAR(100) NOT NULL,
  user_type INT not null,
  PRIMARY KEY (id),
  UNIQUE (email),
  FOREIGN KEY (user_type) references user_type(id)
);

CREATE TABLE if not exists category (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
  idproduct INT NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY (name)
);

CREATE TABLE if not exists product (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  description TEXT,
  price DECIMAL(10, 2) NOT NULL,
  idcategory INT,
  PRIMARY KEY (id),
  FOREIGN KEY (idcategory) REFERENCES category(id)
);

CREATE TABLE if not exists cart (
  id INT NOT NULL AUTO_INCREMENT,
  iduser INT NOT NULL,
  idproduct INT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (iduser) REFERENCES user(id),
  FOREIGN KEY (idproduct) REFERENCES product(id)
);
