DROP TABLE IF EXISTS nail_technician;
CREATE TABLE nail_technician(
    id INT AUTO_INCREMENT PRIMARY KEY,
    first_name VARCHAR(32) DEFAULT '' NOT NULL,
    last_name VARCHAR(32) DEFAULT NULL
);
