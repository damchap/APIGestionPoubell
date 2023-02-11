package com.boc.gestionPoubelle.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="habitation")
public  class Habitation {
	@Id
	@Column(name="id_habitation")
	private String idHabitation;
	@Column(name="adr_rue_hab")
	private String adrRueHab;
	@Column(name="cp_hab")
	private String cpHab;
	@Column(name="adr_ville_hab")
	private String adrVilleHab;
	@Column(name="nb_personne")
	private int nbPersonne;
	@ManyToOne (
			cascade = CascadeType.REMOVE
	)
	@JsonIgnore// 1 usager pour l'habitation
	@JoinColumn(name="id_usager")
	private Usager usager;
	@OneToMany  // plusieurs poubelles pour 1 habitation
	@JoinColumn(name = "id_habitation")
	private List<Poubelle> lesPoubelles;
	@OneToMany  // plusieurs factures pour 1 habitation
	@JoinColumn(name = "id_habitation")
	private List<Facture> lesFactures;

	public void addUsager(Usager usager) {
		this.usager = usager;
	}
	public void removeUsager(Usager usager) {
		this.usager = null;
	}

	public String getIdHabitation() {
		return idHabitation;
	}
	public String getAdrRueHab() {
		return adrRueHab;
	}

	public void setAdrRueHab(String adrRueHab) {
		this.adrRueHab = adrRueHab;
	}

	public String getCpHab() {
		return cpHab;
	}

	public void setCpHab(String cpHab) {
		this.cpHab = cpHab;
	}

	public String getAdrVilleHab() {
		return adrVilleHab;
	}

	public void setAdrVilleHab(String adrVilleHab) {
		this.adrVilleHab = adrVilleHab;
	}

	public int getNbPersonne() {
		return nbPersonne;
	}

	public void setNbPersonne(int nbPersonne) {
		this.nbPersonne = nbPersonne;
	}
	public Usager getUsager() {
		return usager;
	}
	public void setUsager(Usager usager) {
		this.usager = usager;
	}
	public List<Poubelle> getLesPoubelles() {
		return lesPoubelles;
	}
	public void setLesPoubelles(ArrayList<Poubelle> lesPoubelles) {
		this.lesPoubelles = lesPoubelles;
	}
	public void addPoubelle(Poubelle p) {
		lesPoubelles.add(p);
	}
	public double getCout(int an , int mois)
	{
		double total=0;
	// parcours des poubelles pour cumul des poubelles du mois et de l'ann�e
		for(Poubelle p : lesPoubelles) {
			total = total + p.getCout(an, mois);
		}
		return (double) Math.round(total * 100) / 100;
	}

	public List<Facture> getLesFactures() {
		return lesFactures;
	}
	public void setLesFactures(List<Facture> lesFactures) {
		this.lesFactures = lesFactures;
	}
	@Override
	public String toString() {
		return "Habitation [idHabitation=" + idHabitation + ", adrRueHab=" + adrRueHab + ", cpHab=" + cpHab
				+ ", adrVilleHab=" + adrVilleHab + ", nbPersonne=" + nbPersonne + ", usager=" + usager
				+ ", lesPoubelles=" + lesPoubelles + "]";
	}


}
