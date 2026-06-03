CREATE TABLE user_home_conditions (
    id INT NOT NULL AUTO_INCREMENT,
    `condition` VARCHAR(255) NOT NULL UNIQUE,

    PRIMARY KEY (id)
);

INSERT into user_home_conditions(`condition`)
values
    ('OWNER'),
    ('VISIT'),
    ('RESIDENT');