package com.boc.gestionPoubelle.service.impl;

import com.boc.gestionPoubelle.model.Facture;
import com.boc.gestionPoubelle.model.Usager;
import com.boc.gestionPoubelle.service.FactureService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service("factureService")
public class FactureServiceImpl implements FactureService {
    /**
     * @param facture
     */
    @Override
    public void create(Facture facture) {

    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Facture> getById(int id) {
        return Optional.empty();
    }

    /**
     * @return
     */
    @Override
    public List<Facture> get() {
        return null;
    }

    /**
     * @param id
     */
    @Override
    public void delete(int id) {

    }

    /**
     * @param usager
     * @return
     */
    @Override
    public Optional<Facture> update(Usager usager) {
        return Optional.empty();
    }
}
