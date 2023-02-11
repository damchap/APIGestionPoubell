package com.boc.gestionPoubelle.controller.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A DTO for the {@link com.boc.gestionPoubelle.model.Poubelle} entity
 */
public class PoubelleDto implements Serializable {
    private final TypeDechetDto nature;
    private final String idHabitation;
    private final List<LeveeDto> lesLevees;

    public PoubelleDto(TypeDechetDto nature, String idHabitation, List<LeveeDto> lesLevees) {
        this.nature = nature;
        this.idHabitation = idHabitation;
        this.lesLevees = lesLevees;
    }

    public TypeDechetDto getNature() {
        return nature;
    }

    public String getIdHabitation() {
        return idHabitation;
    }

    public List<LeveeDto> getLesLevees() {
        return lesLevees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PoubelleDto entity = (PoubelleDto) o;
        return Objects.equals(this.nature, entity.nature) &&
                Objects.equals(this.idHabitation, entity.idHabitation) &&
                Objects.equals(this.lesLevees, entity.lesLevees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nature, idHabitation, lesLevees);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "nature = " + nature + ", " +
                "idHabitation = " + idHabitation + ", " +
                "lesLevees = " + lesLevees + ")";
    }
}
