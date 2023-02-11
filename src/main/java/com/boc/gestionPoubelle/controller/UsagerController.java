package com.boc.gestionPoubelle.controller;

import com.boc.gestionPoubelle.model.Usager;
import com.boc.gestionPoubelle.service.UsagerService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/usagers")
public class UsagerController {
    @Resource(name = "usagerService")
    private UsagerService usagerService;

    @GetMapping
    public List<Usager> getAllUsagers() {
        // usagerService.getAll() to json encoded string
        return usagerService.getAll();
    }
    @GetMapping("/{id}")
    public Usager get(@PathVariable String id) {
        return usagerService.getById(id).orElseThrow(() -> new RuntimeException("User not found : " + id));
    }
    @PostMapping()
    public Usager create(@RequestBody Usager usager) {
        return usagerService.create(usager);
    }

    @PutMapping("/{id}")
    public Optional<Usager> update(@PathVariable String id, @RequestBody Usager usager) {
        return usagerService.update(usager);
    }

}
