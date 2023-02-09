package com.boc.gestionPoubelle.controller;

import com.boc.gestionPoubelle.service.SchoolService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/school")
public class SchoolController {

    SchoolService schoolService;

    SchoolController(SchoolService schoolService){
        this.schoolService = schoolService;
    }

    @GetMapping
    List<School> get(){
        return schoolService.get();
    }
}
