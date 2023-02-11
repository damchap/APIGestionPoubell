package com.boc.gestionPoubelle.service;

import com.boc.gestionPoubelle.model.Usager;

import java.util.List;
import java.util.Optional;

public interface UsagerService {
    Usager create(Usager usager );
    Optional<Usager> getById(String id);
    /**
     * Get list of usager
     *
     * @return list of users
     */
    List<Usager> getAll();
    void delete(int id);
    Optional<Usager> update(Usager usager );
}
