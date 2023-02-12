package com.boc.gestionPoubelle.service.impl;

import com.boc.gestionPoubelle.model.Habitation;
import com.boc.gestionPoubelle.model.Usager;
import com.boc.gestionPoubelle.repository.HabitationRepository;
import com.boc.gestionPoubelle.repository.UsagerRepository;
import com.boc.gestionPoubelle.service.HabitationService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service("habitationService")
public class HabitationServiceImpl implements HabitationService {
    private final HabitationRepository habitationRepository;
    private final UsagerRepository usagerRepository;

    public HabitationServiceImpl(HabitationRepository habitationRepository,
                                 UsagerRepository usagerRepository) {
        this.habitationRepository = habitationRepository;
        this.usagerRepository = usagerRepository;
    }

    /**
     * @param habitation
     * @return
     */
    @Override
    public Habitation create(Habitation habitation) {
        return habitationRepository.save(habitation);
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Habitation> getById(String id) {
        return habitationRepository.findById(id);
    }

    /**
     * @return
     */
    @Override
    public List<Habitation> getAll() {
        return habitationRepository.findAll();
    }

    /**
     * @param id
     */
    @Override
    public void delete(String id) {

    }

    @Override
    public Habitation update(Habitation habitation) {
        return habitationRepository.save(habitation);
    }

    /**
     * @param id
     */
    public void delete(int id) {

    }

    /**
     * @param id
     * @return
     */
    @Override
    public List<Habitation> getHabitationByUsager(String id) {
        Usager usager = usagerRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found : " + id));
        List<Habitation> lesHabitations = usager.getLesHabitations();
        return lesHabitations;
    }
}
