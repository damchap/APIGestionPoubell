package com.boc.gestionPoubelle.repository;

import com.boc.gestionPoubelle.model.Usager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsagerRepository extends JpaRepository<Usager, String> {
}
