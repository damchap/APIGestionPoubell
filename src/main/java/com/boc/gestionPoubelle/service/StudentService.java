package com.boc.gestionPoubelle.service;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    void create(Student student);
    Optional<Student> getById(Long id);
    List<Student> get();
    void delete(Long id);
    Optional<Student> update(Student student);
}
