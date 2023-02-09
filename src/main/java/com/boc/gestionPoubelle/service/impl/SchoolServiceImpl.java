package com.boc.gestionPoubelle.service.impl;

import com.boc.gestionPoubelle.service.SchoolService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolServiceImpl implements SchoolService {


    /**
     * @param school
     */
    @Override
    public void create(School school) {

    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<School> getById(Long id) {
        return Optional.empty();
    }

    /**
     * @return
     */
    @Override
    public List<School> get() {
        return null;
    }

    /**
     * @param id
     */
    @Override
    public void delete(Long id) {

    }

    /**
     * @param school
     * @return
     */
    @Override
    public Optional<School> update(School school) {
        return Optional.empty();
    }
}
