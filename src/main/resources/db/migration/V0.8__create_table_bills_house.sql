CREATE TABLE bills_house (
    id INT NOT NULL AUTO_INCREMENT,
    date DATE NOT NULL,
    light_bill DECIMAL(10,2),
    water_bill DECIMAL(10,2),
    groceries DECIMAL(10,2),
    internet_bill DECIMAL(10,2),
    rent DECIMAL(10,2),
    id_house CHAR(36) NOT NULL,

    PRIMARY KEY (id),

    CONSTRAINT fk_bills_house_home FOREIGN KEY (id_house) REFERENCES home(id)
);