package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;


@Entity
@AllArgsConstructor
public class Facture implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date dateEmission;
	private Integer prixUnitaire;
	private Integer montantTotal;
	
	@OneToOne
	@JsonIgnore
	private Reservation reservationAttache;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateEmission() {
		return dateEmission;
	}
	public void setDateEmission(Date dateEmission) {
		this.dateEmission = dateEmission;
	}
	public Integer getPrixUnitaire() {
		return prixUnitaire;
	}
	public void setPrixUnitaire(Integer prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}
	public Integer getMontantTotal() {
		return montantTotal;
	}
	public void setMontantTotal(Integer montantTotal) {
		this.montantTotal = montantTotal;
	}
	public Reservation getReservationAttache() {
		return reservationAttache;
	}
	public void setReservationAttache(Reservation reservationAttache) {
		this.reservationAttache = reservationAttache;
	}
	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
