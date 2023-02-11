package com.boc.gestionPoubelle.service.impl;

import com.boc.gestionPoubelle.model.Levee;
import com.boc.gestionPoubelle.service.LeveeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service("leveeService")
public class LeveeServiceImpl implements LeveeService {
    /**
     * @param levee
     */
    @Override
    public void create(Levee levee) {

    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<Levee> getById(int id) {
        return Optional.empty();
    }

    /**
     * @return
     */
    @Override
    public List<Levee> get() {
        return null;
    }

    /**
     * @param id
     */
    @Override
    public void delete(int id) {

    }

    /**
     * @param levee
     * @return
     */
    @Override
    public Optional<Levee> update(Levee levee) {
        return Optional.empty();
    }
}
