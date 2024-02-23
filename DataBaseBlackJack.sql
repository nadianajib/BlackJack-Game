create table Carte (
id_Carte  SERIAL PRIMARY KEY ,
type VARCHAR(55) NOT NULL,
valeur INT NOT NULL
);

CREATE TABLE PaquetCarte (
id_paquetCarte INT PRIMARY KEY ,
taille_paquetCartes INT	
	
);
CREATE TABLE Main (
    id_main INT PRIMARY KEY,
    valeurTotal_main INT,
    nbCartes_main INT
);
CREATE TABLE Joueur (
id_joueur INT PRIMARY KEY ,
username_joueur VARCHAR(25)	,
solde_joueur INT,
id_main	INT ,
FOREIGN KEY (id_main) REFERENCES main(id_main)

);
create table Croupier(
id_croupier SERIAL PRIMARY KEY,
valeurTotalLimit int,
CONSTRAINT id_main foreign Key(id_main) references Main(id_main)
);

