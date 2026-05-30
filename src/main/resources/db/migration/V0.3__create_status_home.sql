CREATE TABLE status_home (
    id INT NOT NULL AUTO_INCREMENT,
    status VARCHAR(255) NOT NULL UNIQUE,

    PRIMARY KEY (id)
);

INSERT into status_home(status)
values
    ('RENTING'),
    ('FOR_SALE'),
    ('RENTED');