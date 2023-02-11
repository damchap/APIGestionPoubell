package com.boc.gestionPoubelle.controller;

import com.boc.gestionPoubelle.model.Habitation;
import com.boc.gestionPoubelle.service.HabitationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/api/habitation")
public class HabitationController {
    @Resource(name = "habitationService")
    private HabitationService habitationService;

    @GetMapping
    public List<Habitation> getAllHabitations() {
        // habitationService.getAll() to json encoded string
        return habitationService.get();
    }
}
