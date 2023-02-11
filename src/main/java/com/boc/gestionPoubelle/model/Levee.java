package com.boc.gestionPoubelle.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="levee")
public class Levee {
	@Id
	@GeneratedValue
	@Column(name="id_levee")
	private Long idLevee;
	@Column(name="la_date")
	private Date laDate;
	@Column(name="poids")
	private double poids;
	@Column(name="id_poubelle")
	private String idPoubelle;

	public long getIdLevee() {
		return idLevee;
	}
	public Date getLaDate() {
		return laDate;
	}
	public void setLaDate(Date laDate) {
		this.laDate = laDate;
	}
	public double getPoids() {
		return poids;
	}
	public void setPoids(double poids) {
		this.poids = poids;
	}

	public String getIdPoubelle() {
		return idPoubelle;
	}

	public void setIdPoubelle(String idPoubelle) {
		this.idPoubelle = idPoubelle;
	}



	@Override
	public String toString() {
		return "Levee [idLevee=" + idLevee + ", laDate=" + laDate + ", poids=" + poids + ", idPoubelle=" + idPoubelle
				+  "]";
	}

}
