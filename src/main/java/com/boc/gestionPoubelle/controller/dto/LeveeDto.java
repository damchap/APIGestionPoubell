package com.boc.gestionPoubelle.controller.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * A DTO for the {@link com.boc.gestionPoubelle.model.Levee} entity
 */
public class LeveeDto implements Serializable {
    private final Date laDate;
    private final double poids;
    private final String idPoubelle;

    public LeveeDto(Date laDate, double poids, String idPoubelle) {
        this.laDate = laDate;
        this.poids = poids;
        this.idPoubelle = idPoubelle;
    }

    public Date getLaDate() {
        return laDate;
    }

    public double getPoids() {
        return poids;
    }

    public String getIdPoubelle() {
        return idPoubelle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LeveeDto entity = (LeveeDto) o;
        return Objects.equals(this.laDate, entity.laDate) &&
                Objects.equals(this.poids, entity.poids) &&
                Objects.equals(this.idPoubelle, entity.idPoubelle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(laDate, poids, idPoubelle);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "laDate = " + laDate + ", " +
                "poids = " + poids + ", " +
                "idPoubelle = " + idPoubelle + ")";
    }
}
