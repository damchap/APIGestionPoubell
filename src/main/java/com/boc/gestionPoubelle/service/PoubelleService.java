package com.boc.gestionPoubelle.service;

import com.boc.gestionPoubelle.model.Poubelle;
import com.boc.gestionPoubelle.model.Usager;

import java.util.List;
import java.util.Optional;

public interface PoubelleService {

    void create( Poubelle poubelle );
    Optional<Poubelle> getById(String id);
    List<Poubelle> get();
    void delete(String id);
    Optional<Poubelle> update(Poubelle poubelle);
}
