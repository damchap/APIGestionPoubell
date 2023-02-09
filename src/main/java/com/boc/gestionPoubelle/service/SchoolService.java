package com.boc.gestionPoubelle.service;

import java.util.List;
import java.util.Optional;

public interface SchoolService {
    void create(School school);
    Optional<School> getById(Long id);
    List<School> get();
    void delete(Long id);
    Optional<School> update(School school);
}
