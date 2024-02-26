 
INSERT INTO carte (id_carte, type, valeur) 
VALUES ('1', 'Rouge', '4');

INSERT INTO carte (id_carte, type, valeur ) 
VALUES ('2', 'Rouge', '3');

INSERT INTO main (id_main,valeurtotal,nbcartes ) 
VALUES ('1', '12', '4');

INSERT INTO main (id_main,valeurtotal,nbcartes ) 
VALUES ('2', '17', '3');

INSERT INTO croupier (id_croupier,valeurtotallimit,id_main ) 
VALUES ('1', '12', '1');

INSERT INTO croupier (id_croupier,valeurtotallimit,id_main ) 
VALUES ('2', '21', '2');


INSERT INTO joueur (id_joueur,username,solde,id_main ) 
VALUES ('1', 'Test','21', '1');

INSERT INTO joueur (id_joueur,username,solde,id_main ) 
VALUES ('2', 'Ahmed','20', '2');

INSERT INTO paquetcarte (id_paquetcarte) 
VALUES ('1');

INSERT INTO paquetcarte (id_paquetcarte ) 
VALUES ('2');
