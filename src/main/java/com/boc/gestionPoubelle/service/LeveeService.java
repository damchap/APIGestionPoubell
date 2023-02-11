package com.boc.gestionPoubelle.service;

import com.boc.gestionPoubelle.model.Levee;
import com.boc.gestionPoubelle.model.Usager;

import java.util.List;
import java.util.Optional;

public interface LeveeService {
    void create(Levee levee);
    Optional<Levee> getById(int id);
    List<Levee> get();
    void delete(int id);
    Optional<Levee> update(Levee levee);
}
