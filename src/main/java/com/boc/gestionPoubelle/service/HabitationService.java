package com.boc.gestionPoubelle.service;

import com.boc.gestionPoubelle.model.Habitation;
import com.boc.gestionPoubelle.model.Usager;

import java.util.List;
import java.util.Optional;

public interface HabitationService {
    Habitation create(Habitation habitation);
    Optional<Habitation> getById(String id);
    List<Habitation> getAll();
    void delete(String id);
    Habitation update(Habitation habitation);

    List<Habitation> getHabitationByUsager(String id);
}
