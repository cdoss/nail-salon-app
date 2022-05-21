DROP TABLE IF EXISTS appointment;
CREATE TABLE appointment (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(32) DEFAULT '' NOT NULL,
    nail_technician_id INT NOT NULL,
    `time` TIMESTAMP DEFAULT NOW() NOT NULL,
    FOREIGN KEY (nail_technician_id) REFERENCES nail_technician(id)
);
