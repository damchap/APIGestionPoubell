INSERT INTO usager (id_usager, nom, prenom, adr_rue_usager, cp_usager, adr_ville_usager, login, mdp) VALUES
                                                                                                         ('usag1', 'Chapart', 'Damien', 'rue bonjour', '29200', 'brest', 'damchap', '111'),
                                                                                                         ('usag2', 'Toscer', 'Claude', '', '', '', 'toscer', '222'),
                                                                                                         ('usag3', 'Le Dall', 'Patrick', '', '', '', 'ledall', '333'),
                                                                                                         ('usag4', 'Dupont', 'Laurent', '19, rue du général de Gaulle', '29150', 'Plomodiern', 'dupont', '444');

INSERT INTO habitation (id_habitation, adr_rue_hab, cp_hab, adr_ville_hab, nb_personne, id_usager) VALUES
                                                                                                     ('hab1', '18, Hameau de Pentrez', '29550', 'Saint-Nic', 2, 'usag1'),
                                                                                                     ('hab2', 'Quai Carnot', '29150', 'Châteaulin', 1, 'usag2'),
                                                                                                     ('hab3', 'Kerbolé', '29150', 'Cast', 2, 'usag1');

INSERT INTO facture (id_facture, mois_f, an_f, nom_facture, id_habitation) VALUES (7, 7, 2015, 'hab1-usag1-Facture-juillet-2015.pdf', 'hab1'),
    (8, 7, 2015, 'hab2-usag2-Facture-juillet-2015.pdf', 'hab2'),
    (9, 7, 2015, 'hab3-usag1-Facture-juillet-2015.pdf', 'hab3'),
    (13, 7, 2016, 'hab1-usag1-Facture-juillet-2016.pdf', 'hab1'),
    (14, 7, 2016, 'hab2-usag2-Facture-juillet-2016.pdf', 'hab2'),
    (15, 7, 2016, 'hab3-usag1-Facture-juillet-2016.pdf', 'hab3'),
    (160, 9, 2020, 'hab1-usag1-Facture-septembre-2020.pdf', 'hab1'),
    (161, 9, 2020, 'hab2-usag2-Facture-septembre-2020.pdf', 'hab2'),
    (162, 9, 2020, 'hab3-usag1-Facture-septembre-2020.pdf', 'hab3'),
    (163, 9, 2019, 'hab1-usag1-Facture-septembre-2019.pdf', 'hab1'),
    (164, 9, 2019, 'hab2-usag2-Facture-septembre-2019.pdf', 'hab2'),
    (165, 9, 2019, 'hab3-usag1-Facture-septembre-2019.pdf', 'hab3');


INSERT INTO typedechet (id_type_dechet, libelle, tarif) VALUES
                                                           ('C', 'déchets classiques', 0.1556),
                                                           ('R', 'déchets recyclables', 0.251),
                                                           ('V', 'verre recyclable', 0.1156);
INSERT INTO poubelle (id_poubelle, id_type_dechet, id_habitation) VALUES
                                                                     ('pb1', 'V', 'hab1'),
                                                                     ('pb2', 'R', 'hab1'),
                                                                     ('pb3', 'R', 'hab2'),
                                                                     ('pb4', 'V', 'hab2'),
                                                                     ('pb5', 'C', 'hab1'),
                                                                     ('pb6', 'C', 'hab2');

INSERT INTO levee (id_levee, la_date, poids, id_poubelle) VALUES
                                                                     (1, '2015-07-15', 5, 'pb1'),
                                                                     (4, '2015-07-17', 15, 'pb2'),
                                                                     (5, '2015-07-17', 12.5, 'pb1'),
                                                                     (6, '2015-07-17', 2, 'pb2'),
                                                                     (7, '2015-07-17', 12.5, 'pb1'),
                                                                     (8, '2015-07-17', 2, 'pb2'),
                                                                     (9, '2016-07-17', 12.5, 'pb1'),
                                                                     (10, '2016-07-17', 2, 'pb2'),
                                                                     (11, '2017-07-17', 12.5, 'pb1'),
                                                                     (12, '2017-07-17', 2, 'pb2'),
                                                                     (13, '2016-07-17', 12.5, 'pb1'),
                                                                     (14, '2016-07-17', 2, 'pb2'),
                                                                     (15, '2017-07-17', 12.5, 'pb1'),
                                                                     (16, '2017-07-17', 2, 'pb2'),
                                                                     (17, '2016-07-17', 12.5, 'pb1'),
                                                                     (18, '2016-07-17', 2, 'pb2'),
                                                                     (19, '2017-07-17', 12.5, 'pb1'),
                                                                     (20, '2017-07-17', 2, 'pb2'),
                                                                     (21, '2019-07-08', 7, 'pb1'),
                                                                     (22, '2019-09-19', 10, 'pb2'),
                                                                     (23, '2019-09-09', 7, 'pb1'),
                                                                     (25, '2019-09-06', 12.5, 'pb5'),
                                                                     (26, '2019-09-27', 14, 'pb5');




