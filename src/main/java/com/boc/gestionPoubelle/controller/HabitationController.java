package com.boc.gestionPoubelle.controller;

import com.boc.gestionPoubelle.model.Habitation;
import com.boc.gestionPoubelle.model.Usager;
import com.boc.gestionPoubelle.repository.UsagerRepository;
import com.boc.gestionPoubelle.service.HabitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.annotation.Resource;
import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/habitations")
public class HabitationController {
    @Resource(name = "habitationService")
    private HabitationService habitationService;
    @Resource(name = "usagerRepository")
    private final UsagerRepository usagerRepository;

    @Autowired
    public HabitationController(HabitationService habitationService, UsagerRepository usagerRepository) {
        this.habitationService = habitationService;
        this.usagerRepository = usagerRepository;
    }
    @GetMapping
    public List<Habitation> getAllHabitations() {
        // habitationService.getAll() to json encoded string
        return habitationService.getAll();
    }
    @GetMapping("/{id}")
    public Habitation get(@PathVariable String id) {
        return habitationService.getById(id).orElseThrow(() -> new RuntimeException("User not found : " + id));
    }
    @GetMapping("/usager/{id}")
    public List<Habitation> getHabitationByUsager(@PathVariable String id) {
        return habitationService.getHabitationByUsager(id);
    }
    @PostMapping()
    public ResponseEntity<Habitation> create( @RequestBody @Validated Habitation habitation) {

        return null;

    }
    @PutMapping("/{id}")
    public Habitation update(@PathVariable String id, @RequestBody Habitation habitation) {
        return habitationService.update(habitation);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        habitationService.delete(id);
    }
}
