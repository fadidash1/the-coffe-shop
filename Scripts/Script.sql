CREATE TABLE admin (
  id INT NOT NULL AUTO_INCREMENT,
  fname VARCHAR(50) NOT NULL,
  lname VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  password VARCHAR(100) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY (email)
);

CREATE TABLE client (
  id INT NOT NULL AUTO_INCREMENT,
  fname VARCHAR(50) NOT NULL,
  lname VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  password VARCHAR(100) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY (email)
);

CREATE TABLE category (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
  productid INT NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY (name),
  FOREIGN KEY (productid) REFERENCES product(id)
);

CREATE TABLE product (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
  description TEXT,
  price DECIMAL(10, 2) NOT NULL,
  categoryid INT,
  PRIMARY KEY (id),
  FOREIGN KEY (categoryid) REFERENCES category(id)
);
CREATE TABLE cart (
  id INT NOT NULL AUTO_INCREMENT,
  idclient INT NOT NULL,
  idproduct INT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (idclient) REFERENCES client(id),
  FOREIGN KEY (idproduct) REFERENCES product(id)
);
