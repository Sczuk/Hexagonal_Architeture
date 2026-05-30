CREATE TABLE home (
    id CHAR(36) NOT NULL,
    id_status_house INT NOT NULL,
    id_address INT NOT NULL,

    PRIMARY KEY (id),

    CONSTRAINT fk_home_status FOREIGN KEY (id_status_house) REFERENCES status_home(id),
    CONSTRAINT fk_home_address FOREIGN KEY (id_address) REFERENCES address(id)
);