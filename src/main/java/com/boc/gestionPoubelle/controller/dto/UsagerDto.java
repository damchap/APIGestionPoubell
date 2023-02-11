package com.boc.gestionPoubelle.controller.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A DTO for the {@link com.boc.gestionPoubelle.model.Usager} entity
 */
public class UsagerDto implements Serializable {
    private final String nom;
    private final String prenom;
    private final String adrRueUsager;
    private final String cpUsager;
    private final String adrVilleUsager;
    private final String login;
    private final String mdp;
    private final List<HabitationDto> lesHabitations;

    public UsagerDto(String nom, String prenom, String adrRueUsager, String cpUsager, String adrVilleUsager, String login, String mdp, List<HabitationDto> lesHabitations) {
        this.nom = nom;
        this.prenom = prenom;
        this.adrRueUsager = adrRueUsager;
        this.cpUsager = cpUsager;
        this.adrVilleUsager = adrVilleUsager;
        this.login = login;
        this.mdp = mdp;
        this.lesHabitations = lesHabitations;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getAdrRueUsager() {
        return adrRueUsager;
    }

    public String getCpUsager() {
        return cpUsager;
    }

    public String getAdrVilleUsager() {
        return adrVilleUsager;
    }

    public String getLogin() {
        return login;
    }

    public String getMdp() {
        return mdp;
    }

    public List<HabitationDto> getLesHabitations() {
        return lesHabitations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UsagerDto entity = (UsagerDto) o;
        return Objects.equals(this.nom, entity.nom) &&
                Objects.equals(this.prenom, entity.prenom) &&
                Objects.equals(this.adrRueUsager, entity.adrRueUsager) &&
                Objects.equals(this.cpUsager, entity.cpUsager) &&
                Objects.equals(this.adrVilleUsager, entity.adrVilleUsager) &&
                Objects.equals(this.login, entity.login) &&
                Objects.equals(this.mdp, entity.mdp) &&
                Objects.equals(this.lesHabitations, entity.lesHabitations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, adrRueUsager, cpUsager, adrVilleUsager, login, mdp, lesHabitations);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
                "nom = " + nom + ", " +
                "prenom = " + prenom + ", " +
                "adrRueUsager = " + adrRueUsager + ", " +
                "cpUsager = " + cpUsager + ", " +
                "adrVilleUsager = " + adrVilleUsager + ", " +
                "login = " + login + ", " +
                "mdp = " + mdp + ", " +
                "lesHabitations = " + lesHabitations + ")";
    }
}
