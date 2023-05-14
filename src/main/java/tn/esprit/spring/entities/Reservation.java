package tn.esprit.spring.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;

@Entity
@AllArgsConstructor
public class Reservation implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date dateReservation;
	private Integer dureSejour;
	private Integer nbreDePersonne;

	
//	@ManyToOne(cascade=CascadeType.ALL)
//	private User user;

	@OneToOne
	@JsonIgnore
	private Facture factureAttache;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Integer getDureSejour() {
		return dureSejour;
	}
	public void setDureSejour(Integer dureSejour) {
		this.dureSejour = dureSejour;
	}
	

	public Date getDateReservation() {
		return dateReservation;
	}
	public void setDateReservation(Date dateReservation) {
		this.dateReservation = dateReservation;
	}
	
	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getNbreDePersonne() {
		return nbreDePersonne;
	}
	public void setNbreDePersonne(Integer nbreDePersonne) {
		this.nbreDePersonne = nbreDePersonne;
	}
	public Facture getFactureAttache() {
		return factureAttache;
	}
	public void setFactureAttache(Facture factureAttache) {
		this.factureAttache = factureAttache;
	}
//	public User getUser() {
//		return user;
//	}
//	public void setUser(User user) {
//		this.user = user;
//	}
	
}
