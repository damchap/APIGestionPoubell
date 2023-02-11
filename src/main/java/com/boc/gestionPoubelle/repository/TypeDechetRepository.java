package com.boc.gestionPoubelle.repository;

import com.boc.gestionPoubelle.model.TypeDechet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeDechetRepository extends JpaRepository<TypeDechet, String> {
}
