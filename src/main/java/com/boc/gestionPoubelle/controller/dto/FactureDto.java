package com.boc.gestionPoubelle.controller.dto;

import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.boc.gestionPoubelle.model.Facture} entity
 */
public class FactureDto implements Serializable {
    private final int moisF;
    private final int anF;
    private final String nomFacture;
    private final String idHabitation;

    public FactureDto(int moisF, int anF, String nomFacture, String idHabitation) {
        this.moisF = moisF;
        this.anF = anF;
        this.nomFacture = nomFacture;
        this.idHabitation = idHabitation;
    }

    public int getMoisF() {
        return moisF;
    }

    public int getAnF() {
        return anF;
    }

    public String getNomFacture() {
        return nomFacture;
    }

    public String getIdHabitation() {
        return idHabitation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FactureDto entity = (FactureDto) o;
        return Objects.equals(this.moisF, entity.moisF) &&
                Objects.equals(this.anF, entity.anF) &&
                Objects.equals(this.nomFacture, entity.nomFacture) &&
                Objects.equals(this.idHabitation, entity.idHabitation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moisF, anF, nomFacture, idHabitation);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "moisF = " + moisF + ", " +
                "anF = " + anF + ", " +
                "nomFacture = " + nomFacture + ", " +
                "idHabitation = " + idHabitation + ")";
    }
}
