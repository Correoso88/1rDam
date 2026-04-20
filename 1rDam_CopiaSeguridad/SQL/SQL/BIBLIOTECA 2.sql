DROP TABLE AUTOR_LLIBRE;
DROP TABLE LLIBRE_GENERE;
DROP TABLE LLIBRE;
DROP TABLE EDITORIAL;
DROP TABLE AUTOR;
DROP TABLE GENERE;

CREATE TABLE EDITORIAL(
    ID number generated as identity primary key,
    nom varchar2(50)
);

CREATE TABLE LLIBRE (
    ID number generated as identity primary key,
    titol varchar2(50),
    an number CHECK(an <= 2023),
    exemplars number CHECK (exemplars > 0),
    ID_editorial number NOT NULL,
    ID_sequela number,
    foreign key (ID_editorial) references EDITORIAL(ID),
    foreign key (ID_sequela) references LLIBRE(ID),
    unique (titol, an)
);


CREATE TABLE AUTOR (
    ID number generated as identity primary key,
    nom varchar2(50),
    cognoms varchar2(50),
    data_naix date,
    nacionalitat varchar2(3),
    unique (nom, cognoms, nacionalitat)
);

CREATE TABLE AUTOR_LLIBRE(
    ID_autor number,
    ID_llibre number,
    primary key(ID_autor, ID_llibre),
    foreign key (ID_autor) references AUTOR(ID),
    foreign key (ID_llibre) references LLIBRE(ID)
);

CREATE TABLE GENERE(
    nom varchar2(50) primary key
);

CREATE TABLE LLIBRE_GENERE(
    ID_llibre number,
    nom_genere varchar2(50),
    foreign key (ID_llibre) references LLIBRE(ID),
    foreign key (nom_genere) references GENERE(nom),
    primary key (ID_llibre, nom_genere)
);
INSERT INTO EDITORIAL(NOM) VALUES ( 'Picaro');
INSERT INTO EDITORIAL(NOM) VALUES ( 'LOL');

INSERT INTO LLIBRE (TITOL, AN, EXEMPLARS, ID_EDITORIAL, ID_SEQUELA) VALUES ('IVANTIENEIVA', 2010, 3, 1, NULL);
INSERT INTO LLIBRE (TITOL, AN, EXEMPLARS, ID_EDITORIAL, ID_SEQUELA) VALUES ('IVANNOTIENEIVA', 2020, 3, 1, NULL);

INSERT INTO AUTOR(NOM, COGNOMS, DATA_NAIX, NACIONALITAT) VALUES ('DANIEL', 'PANCHO', DATE'2020-05-09', 'ES');
INSERT INTO AUTOR(NOM, COGNOMS, DATA_NAIX, NACIONALITAT) VALUES ('RONI', 'RONI', DATE'2020-08-23', 'ES');
INSERT INTO AUTOR(NOM, COGNOMS, DATA_NAIX, NACIONALITAT) VALUES ('IVAN', 'SOBERATS', DATE'2020-02-26', 'ES');

INSERT INTO AUTOR_LLIBRE VALUES (1,1);
INSERT INTO AUTOR_LLIBRE VALUES (2,2);
INSERT INTO AUTOR_LLIBRE VALUES (3,2);

DELETE FROM AUTOR_LLIBRE WHERE ID_AUTOR=3 AND ID_LLIBRE=2;
UPDATE LLIBRE SET ID_EDITORIAL=2 WHERE ID=1;
DELETE FROM EDITORIAL WHERE ID=1;
UPDATE LLIBRE SET EXEMPLARS=0 WHERE ID=1;

CREATE TABLE LLIBRES_ESGOTATS (
    ID number primary key,
    titol varchar2(50),
    an number CHECK(an <= 2023),
    exemplars number CHECK (exemplars > 0),
    ID_editorial number NOT NULL,
    ID_sequela number,
    foreign key (ID_editorial) references EDITORIAL(ID),
    foreign key (ID_sequela) references LLIBRE(ID),
    FOREIGN KEY (ID) REFERENCES LLIBRE(ID),
    unique (titol, an)
);

