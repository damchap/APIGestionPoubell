package com.boc.gestionPoubelle.repository;

import com.boc.gestionPoubelle.model.Habitation;
import com.boc.gestionPoubelle.model.Usager;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HabitationRepository extends JpaRepository<Habitation, String> {
    Optional<Habitation> findByUsager(Usager usager);
}
