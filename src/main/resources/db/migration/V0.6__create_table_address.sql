CREATE TABLE address (
    id INT NOT NULL AUTO_INCREMENT,
    country VARCHAR(255) NOT NULL,
    id_state INT NOT NULL,
    city VARCHAR(255) NOT NULL,
    number VARCHAR(255) NOT NULL,
    cep VARCHAR(255) NOT NULL,

    PRIMARY KEY (id),

    CONSTRAINT fk_address_state FOREIGN KEY (id_state) REFERENCES states(id)
);