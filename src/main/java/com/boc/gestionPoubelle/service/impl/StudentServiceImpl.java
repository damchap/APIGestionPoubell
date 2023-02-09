package com.boc.gestionPoubelle.service.impl;

import com.boc.gestionPoubelle.repository.StudentRepository;
import com.boc.gestionPoubelle.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void create(Student student) {
        studentRepository.save(student);
    }

    @Override
    public Optional<Student> getById(Long id) {
        return studentRepository.findById(id);
    }

    @Override
    public List<Student> get() {
        return studentRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        Optional<Student> studentToDelete = getById(id);
        studentRepository.delete(studentToDelete.get());
    }

    @Override
    public Optional<Student> update(Student student) {
        studentRepository.save(student);
        return Optional.empty();
    }
}
