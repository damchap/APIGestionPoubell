package com.boc.gestionPoubelle.repository;

import com.boc.gestionPoubelle.model.Poubelle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PoubelleRepository extends JpaRepository<Poubelle, String> {
}
