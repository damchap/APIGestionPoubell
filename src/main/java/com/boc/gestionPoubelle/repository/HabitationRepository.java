package com.boc.gestionPoubelle.repository;

import com.boc.gestionPoubelle.model.Habitation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitationRepository extends JpaRepository<Habitation, String> {
}
