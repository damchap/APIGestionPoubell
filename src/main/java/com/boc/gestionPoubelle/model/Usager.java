package com.boc.gestionPoubelle.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="usager")
public class Usager {
	@Id
	@Column(name="id_usager")
	private String idUsager;
	@Column(name="nom")
	private String nom;
	@Column(name="prenom")
	private String prenom;
	@Column(name="adr_rue_usager")
	private String adrRueUsager;
	@Column(name="cp_usager")
	private String cpUsager;
	@Column(name="adr_ville_usager")
	private String adrVilleUsager;
	@Column(name="login")
	private String login;
	@Column(name="mdp")
	private String mdp;
	@OneToMany(
			mappedBy = "usager",
			cascade = CascadeType.REMOVE,
			orphanRemoval = true
	)
	List<Habitation> lesHabitations = new ArrayList<>();


	public String getIdUsager() {
		return idUsager;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdrRueUsager() {
		return adrRueUsager;
	}

	public void setAdrRueUsager(String adrRueUsager) {
		this.adrRueUsager = adrRueUsager;
	}

	public String getCpUsager() {
		return cpUsager;
	}

	public void setCpUsager(String cpUsager) {
		this.cpUsager = cpUsager;
	}

	public String getAdrVilleUsager() {
		return adrVilleUsager;
	}

	public void setAdrVilleUsager(String adrVilleUsager) {
		this.adrVilleUsager = adrVilleUsager;
	}

	public List<Habitation> getLesHabitations() {
		return  lesHabitations;
	}

	public void setLesHabitations(ArrayList<Habitation> lesHabitations) {
		this.lesHabitations = lesHabitations;
	}

	public void addHabitation(Habitation h) {
		lesHabitations.add(h);
	}

	@Override
	public String toString() {
		return "Usager [idUsager=" + idUsager + ", nom=" + nom + ", prenom=" + prenom + ", adrRueUsager=" + adrRueUsager
				+ ", cpUsager=" + cpUsager + ", adrVilleUsager=" + adrVilleUsager + "]";
	}

}
