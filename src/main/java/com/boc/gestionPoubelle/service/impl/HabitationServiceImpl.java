package com.boc.gestionPoubelle.service.impl;

import com.boc.gestionPoubelle.model.Habitation;
import com.boc.gestionPoubelle.model.Usager;
import com.boc.gestionPoubelle.repository.HabitationRepository;
import com.boc.gestionPoubelle.service.HabitationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service("habitationService")
public class HabitationServiceImpl implements HabitationService {
    private final HabitationRepository habitationRepository;

    public HabitationServiceImpl(HabitationRepository habitationRepository) {
        this.habitationRepository = habitationRepository;
    }

    /**
     * @param habitation
     */
    @Override
    public void create(Habitation habitation) {

    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Habitation> getById(String id) {
        return Optional.empty();
    }

    /**
     * @return
     */
    @Override
    public List<Habitation> get() {
        return habitationRepository.findAll();
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
     * @param usager
     * @return
     */
    @Override
    public Optional<Habitation> update(Usager usager) {
        return Optional.empty();
    }
}
