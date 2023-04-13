CREATE TABLE user (
  id INT NOT NULL AUTO_INCREMENT,
  fname VARCHAR(50) NOT NULL,
  lname VARCHAR(50) NOT NULL,
  email VARCHAR(100) NOT NULL,
  password VARCHAR(100) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY (email)
);

CREATE TABLE user_type (
  id INT AUTO_INCREMENT PRIMARY KEY,
  user_id INT NOT NULL,
  type ENUM('admin', 'client') NOT NULL
);


CREATE TABLE category (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(50) NOT NULL,
  idproduct INT NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY (name)
);

CREATE TABLE product (
  id INT NOT NULL AUTO_INCREMENT,
  name VARCHAR(100) NOT NULL,
  description TEXT,
  price DECIMAL(10, 2) NOT NULL,
  categoryid INT,
  PRIMARY KEY (id),
  FOREIGN KEY (idcategory) REFERENCES category(id)
);

CREATE TABLE cart (
  id INT NOT NULL AUTO_INCREMENT,
  iduser INT NOT NULL,
  idproduct INT NOT NULL,
  PRIMARY KEY (id),
  FOREIGN KEY (iduser) REFERENCES user(id),
  FOREIGN KEY (idproduct) REFERENCES product(id)
);
