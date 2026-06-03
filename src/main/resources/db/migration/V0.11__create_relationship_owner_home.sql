CREATE TABLE owners_home (
    id INT NOT NULL AUTO_INCREMENT,
    id_user CHAR(36) NOT NULL,
    id_home CHAR(36) NOT NULL,

    PRIMARY KEY (id),

    CONSTRAINT fk_owner_home_user FOREIGN KEY (id_user) REFERENCES users(id),
    CONSTRAINT fk_owner_home_home FOREIGN KEY (id_home) REFERENCES home(id)
);