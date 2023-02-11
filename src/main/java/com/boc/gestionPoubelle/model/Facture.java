package com.boc.gestionPoubelle.model;

import javax.persistence.*;

@Entity
@Table(name = "facture")
public class Facture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_facture")
	private long idFacture;
	@Column(name = "mois_f")
	private int moisF;
	@Column(name = "an_f")
	private int anF;
	@Column(name = "nom_facture")
	private String nomFacture;
	@Column(name = "id_habitation")
	private String idHabitation;


	public Facture() {
		super();
	}

	public Facture(long idFacture, int moisF, int anF, String nomFacture, String idHabitation) {
		super();
		this.idFacture = idFacture;
		this.moisF = moisF;
		this.anF = anF;
		this.nomFacture = nomFacture;
		this.idHabitation = idHabitation;

	}

	// constructeur pour cr�er une nouvelle facture
	public Facture(int moisF, int anF, String nomFacture, String idHabitation) {
		super();
		this.idFacture = 0;
		this.moisF = moisF;
		this.anF = anF;
		this.nomFacture = nomFacture;
		this.idHabitation = idHabitation;

	}

	public long getIdFacture() {
		return idFacture;
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

	public String getIdhabitation() {
		return idHabitation;
	}

	public void setIdhabitation(String idhabitation) {
		this.idHabitation = idhabitation;
	}

	@Override
	public String toString() {
		return "Facture [idFacture=" + idFacture + ", moisF=" + moisF + ", anF=" + anF + ", nomFacture=" + nomFacture
				+ ", idhabitation=" + idHabitation + "]";
	}

}
