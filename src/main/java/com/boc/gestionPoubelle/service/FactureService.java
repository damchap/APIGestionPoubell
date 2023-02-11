package com.boc.gestionPoubelle.service;

import com.boc.gestionPoubelle.model.Facture;
import com.boc.gestionPoubelle.model.Habitation;
import com.boc.gestionPoubelle.model.Usager;

import java.util.List;
import java.util.Optional;

public interface FactureService {
    void create(Facture facture);
    Optional<Facture> getById(int id);
    List<Facture> get();
    void delete(int id);
    Optional<Facture> update(Usager usager );
}
