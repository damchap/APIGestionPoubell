package com.boc.gestionPoubelle.service.impl;

import com.boc.gestionPoubelle.model.Poubelle;
import com.boc.gestionPoubelle.service.PoubelleService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service("poubelleService")
public class PoubelleServiceImpl implements PoubelleService {
    /**
     * @param poubelle
     */
    @Override
    public void create(Poubelle poubelle) {

    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Poubelle> getById(String id) {
        return Optional.empty();
    }

    /**
     * @param id
     * @return
     */
    public Optional<Poubelle> getById(int id) {
        return Optional.empty();
    }

    /**
     * @return
     */
    @Override
    public List<Poubelle> get() {
        return null;
    }

    /**
     * @param id
     */
    @Override
    public void delete(String id) {

    }

    /**
     * @param id
     */
    public void delete(int id) {

    }

    /**
     * @param poubelle
     * @return
     */
    @Override
    public Optional<Poubelle> update(Poubelle poubelle) {
        return Optional.empty();
    }
}
