package com.boc.gestionPoubelle.service.impl;

import com.boc.gestionPoubelle.model.Usager;
import com.boc.gestionPoubelle.repository.UsagerRepository;
import com.boc.gestionPoubelle.service.UsagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("usagerService")
public class UsagerServiceImpl implements UsagerService {

    @Autowired
    UsagerRepository usagerRepository;
    /**
     * @param usager
     * @return
     */
    @Override
    public Usager create(Usager usager) {
        return usager;
    }
    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Usager> getById(String id) {
        return usagerRepository.findById(id);
    }

    /**
     * @return
     */
    @Override
    public List<Usager> getAll() {
        return usagerRepository.findAll();
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
    public Optional<Usager> update(Usager usager) {
        return Optional.empty();
    }
}
