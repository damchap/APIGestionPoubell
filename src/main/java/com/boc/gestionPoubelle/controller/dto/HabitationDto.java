package com.boc.gestionPoubelle.controller.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A DTO for the {@link com.boc.gestionPoubelle.model.Habitation} entity
 */
public class HabitationDto implements Serializable {
    private final String adrRueHab;
    private final String cpHab;
    private final String adrVilleHab;
    private final int nbPersonne;
    private final List<PoubelleDto> lesPoubelles;
    private final List<FactureDto> lesFactures;

    public HabitationDto(String adrRueHab, String cpHab, String adrVilleHab, int nbPersonne, List<PoubelleDto> lesPoubelles, List<FactureDto> lesFactures) {
        this.adrRueHab = adrRueHab;
        this.cpHab = cpHab;
        this.adrVilleHab = adrVilleHab;
        this.nbPersonne = nbPersonne;
        this.lesPoubelles = lesPoubelles;
        this.lesFactures = lesFactures;
    }

    public String getAdrRueHab() {
        return adrRueHab;
    }

    public String getCpHab() {
        return cpHab;
    }

    public String getAdrVilleHab() {
        return adrVilleHab;
    }

    public int getNbPersonne() {
        return nbPersonne;
    }

    public List<PoubelleDto> getLesPoubelles() {
        return lesPoubelles;
    }

    public List<FactureDto> getLesFactures() {
        return lesFactures;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HabitationDto entity = (HabitationDto) o;
        return Objects.equals(this.adrRueHab, entity.adrRueHab) &&
                Objects.equals(this.cpHab, entity.cpHab) &&
                Objects.equals(this.adrVilleHab, entity.adrVilleHab) &&
                Objects.equals(this.nbPersonne, entity.nbPersonne) &&
                Objects.equals(this.lesPoubelles, entity.lesPoubelles) &&
                Objects.equals(this.lesFactures, entity.lesFactures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adrRueHab, cpHab, adrVilleHab, nbPersonne, lesPoubelles, lesFactures);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "adrRueHab = " + adrRueHab + ", " +
                "cpHab = " + cpHab + ", " +
                "adrVilleHab = " + adrVilleHab + ", " +
                "nbPersonne = " + nbPersonne + ", " +
                "lesPoubelles = " + lesPoubelles + ", " +
                "lesFactures = " + lesFactures + ")";
    }
}
