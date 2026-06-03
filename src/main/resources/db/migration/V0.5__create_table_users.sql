CREATE TABLE users (
    id CHAR(36) NOT NULL,
    name VARCHAR(255) NOT NULL,
    cpf VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    id_role INT NOT NULL,

    PRIMARY KEY (id),

    CONSTRAINT fk_user_role FOREIGN KEY (id_role) REFERENCES roles(id)
);