package com.boc.gestionPoubelle.controller;

import com.boc.gestionPoubelle.controller.dto.StudentRequestDto;
import com.boc.gestionPoubelle.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    StudentService studentService;

    StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    List<Student> get(){
        return studentService.get();
    }

    @GetMapping("/{studentId}")
    Optional<Student> getById(@PathVariable(name = "studentId") Long id){
        return studentService.getById(id);
    }

    @PostMapping
    ResponseEntity<Map<String, Object>> create(final @RequestBody StudentRequestDto studentRequestDto){
        Student studentToCreate = new Student();

        studentToCreate.setFirstname(studentRequestDto.getFirstname());
        studentToCreate.setLastname(studentRequestDto.getLastname());
        studentToCreate.setDateOfBirth(studentRequestDto.getDateOfBirth());

        studentToCreate.setCreatedAt(LocalDateTime.now());
        studentService.create(studentToCreate);

        Map<String, Object> responses = new HashMap<>();
        responses.put("created", "true");

        return ResponseEntity.ok(responses);
    }

    @DeleteMapping("/{studentId}")
    ResponseEntity<Map<String, Object>> delete(@PathVariable Long studentId){
        studentService.delete(studentId);

        Map<String, Object> responses = new HashMap<>();
        responses.put("deleted", "true");

        return ResponseEntity.ok(responses);
    }
}
