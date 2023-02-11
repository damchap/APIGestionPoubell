package com.boc.gestionPoubelle.controller.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.boc.gestionPoubelle.model.TypeDechet} entity
 */
public class TypeDechetDto implements Serializable {
    private final String libelle;
    private final double tarif;

    public TypeDechetDto(String libelle, double tarif) {
        this.libelle = libelle;
        this.tarif = tarif;
    }

    public String getLibelle() {
        return libelle;
    }

    public double getTarif() {
        return tarif;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeDechetDto entity = (TypeDechetDto) o;
        return Objects.equals(this.libelle, entity.libelle) &&
                Objects.equals(this.tarif, entity.tarif);
    }

    @Override
    public int hashCode() {
        return Objects.hash(libelle, tarif);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "libelle = " + libelle + ", " +
                "tarif = " + tarif + ")";
    }
}
