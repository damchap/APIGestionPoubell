package com.boc.gestionPoubelle.controller;

import com.boc.gestionPoubelle.model.Habitation;
import com.boc.gestionPoubelle.service.HabitationService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/habitation")
public class HabitationController {
    @Resource(name = "habitationService")
    private HabitationService habitationService;

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
    public Habitation create(@RequestBody Habitation habitation) {
        return habitationService.create(habitation);
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
