CREATE TABLE rooms (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    id_home CHAR(36) NOT NULL,

    PRIMARY KEY (id),

    CONSTRAINT fk_rooms_home FOREIGN KEY (id_home) REFERENCES home(id)
);