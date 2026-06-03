CREATE TABLE states (
    id INT NOT NULL AUTO_INCREMENT,
    state VARCHAR(255) NOT NULL UNIQUE,

    PRIMARY KEY (id)
);

INSERT into states(state)
values
    ('Acre'),
    ('Alagoas'),
    ('Amapa'),
    ('Amazonas'),
    ('Bahia'),
    ('Ceara'),
    ('Distrito_Federal'),
    ('Espirito_Santo'),
    ('Goias'),
    ('Maranhao'),
    ('Mato_Grosso'),
    ('Mato_Grosso_do_Sul'),
    ('Minas_Gerais'),
    ('Para'),
    ('Paraiba'),
    ('Parana'),
    ('Pernambuco'),
    ('Piaui'),
    ('Rio_de_Janeiro'),
    ('Rio_Grande_do_Norte'),
    ('Rio_Grande_do_Sul'),
    ('Rondonia'),
    ('Roraima'),
    ('Santa_Catarina'),
    ('Sao_Paulo'),
    ('Sergipe'),
    ('Tocantins');