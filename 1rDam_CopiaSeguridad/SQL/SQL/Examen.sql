--1
CREATE TABLE CLIENT(
    DNI VARCHAR2(9) PRIMARY KEY,
    Nom VARCHAR2(15),
    Adreca VARCHAR2(30),
    Codi_Postal NUMBER(6),
    Telefon NUMBER(9),
    Emeil VARCHAR2(20)
);

CREATE TABLE MODEL(
    ID NUMBER PRIMARY KEY GENERATED AS IDENTITY,
    AnLlancament DATE,
    Nom VARCHAR2(30),
    Marca VARCHAR2(30),
    IDSustitueix NUMBER,
    FOREIGN KEY (IDSustitueix) REFERENCES MODEL (ID),
    unique(AnLlancament, Nom, Marca)
);

CREATE TABLE REVISIO(
    Codi NUMBER  PRIMARY KEY GENERATED AS IDENTITY,
    Descripcio varchar2(100),
    Fecha date,
    Matricula_Cotxe VARCHAR2(9) NOT NULL,
    FOREIGN KEY (Matricula_Cotxe) REFERENCES COTXE (Matricula)
);

CREATE TABLE COTXE (
    Matricula NUMBER PRIMARY KEY,
    Preu NUMBER,
    Color VARCHAR2(10),
    ID_Model NUMBER,
    DNI_Client NUMBER,
    FOREIGN KEY (ID_Model) REFERENCES MODEL (ID),
    FOREIGN KEY (DNI_Client) REFERENCES CLIENT (DNI)
);

CREATE TABLE PROVA (
    ID_Model NUMBER GENERATED AS IDENTITY,
    DNI_Client VARCHAR2(9),
    Data_prova DATE,
    PRIMARY KEY (DNI_Client,ID_Model),
    FOREIGN KEY (DNI_Client) REFERENCES CLIENT (DNI)
)
--2
INSERT INTO CLIENT(DNI,Nom,Adreca,Codi_Postal,Telefon,Emeil)VALUES("12341234A","Dani","Calle alcala","010011","923423456","ejemplo@nigul.cide.es");
INSERT INTO MODEL(ID,AnLlancament,Nom,Marca,ID_Sustitueix)VALUES("1",DATE'2020-02-25',"tutututititi","Cliot","none");
INSERT INTO MODEL(ID,AnLlancament,Nom,Marca,ID_Sustitueix)VALUES("2",DATE'2020-02-25',"tititotitoi","Mazda","1");
INSERT INTO PROVA(DNI_Client,Data_prova)VALUES("12341234A","2021-05-13");
INSERT INTO COTXE(Matricula,Preu,Color,ID_Model,DNI_Client)VALUES("IFS1923","20","Verd","1","12341234A");
INSERT INTO REVISIO(Descripcio,Fecha,Matricula_Cotxe)VALUES("bla bla bla",DATE'2025-01-22',"IFS1923");
--3
ALTER TABLE CLIENT DROP COLUMN Telefon;
UPDATE CLIENT SET Nom = "Mateu";
DELETE PROVA WHERE Data_prova = TO_DATE('2024','yyyy');






