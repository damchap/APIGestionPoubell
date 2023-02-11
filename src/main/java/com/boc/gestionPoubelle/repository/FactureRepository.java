package com.boc.gestionPoubelle.repository;

import com.boc.gestionPoubelle.model.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FactureRepository extends JpaRepository<Facture, Long> {
}
