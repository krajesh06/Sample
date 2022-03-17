

CREATE TABLE userid(
id INT PRIMARY KEY AUTO_INCREMENT,
customername VARCHAR(100) NOT NULL ,
email VARCHAR(100) ,
PASSWORD VARCHAR(100) NOT NULL,
UNIQUE(customername),
CHECK ( LENGTH (PASSWORD) <= 8)
);

SELECT * FROM userid;

SELECT id,customername,email,PASSWORD FROM userid;

INSERT INTO userid (customername,email,PASSWORD) VALUES ('antony','s@mail.com','pass1234');

DELETE FROM userid;

DROP TABLE userid;