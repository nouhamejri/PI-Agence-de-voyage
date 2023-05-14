package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Facture;

public interface FactureService {
	Long addFacture(Facture fact);

	Long updateFacture (Facture fact);
	
	List<Facture> getFactures();
}
