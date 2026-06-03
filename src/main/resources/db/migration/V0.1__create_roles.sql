CREATE TABLE roles (
    id INT NOT NULL AUTO_INCREMENT,
    role VARCHAR(255) NOT NULL UNIQUE,

    PRIMARY KEY (id)
);
INSERT into roles(role)
values
    ('USER'),
    ('ADMIN');