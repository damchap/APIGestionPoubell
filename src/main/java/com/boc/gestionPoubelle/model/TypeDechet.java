package com.boc.gestionPoubelle.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="typedechet")
public class TypeDechet {
	@Id
	@Column(name="id_type_dechet")
	private String idTypeDechet;
	@Column(name="libelle")
	private String libelle;
	@Column(name="tarif")
	private double tarif;

	public String getIdTypeDechet() {
		return idTypeDechet;
	}
	public double getTarif() {
		return tarif;
	}
	public void setTarif(double tarif) {
		this.tarif = tarif;
	}

	public String getLibelle() {
		return libelle;
	}
	@Override
	public String toString() {
		return "TypeDechet [idTypeDechet=" + idTypeDechet + ", libelle=" + libelle + ", tarif=" + tarif + "]";
	}
}
