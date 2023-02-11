package com.boc.gestionPoubelle.service;

import com.boc.gestionPoubelle.model.Habitation;
import com.boc.gestionPoubelle.model.Usager;

import java.util.List;
import java.util.Optional;

public interface HabitationService {
    void create(Habitation habitation);
    Optional<Habitation> getById(String id);
    List<Habitation> get();
    void delete(String id);
    Optional<Habitation> update(Usager usager );
}
