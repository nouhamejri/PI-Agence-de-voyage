package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entities.Facture;
import tn.esprit.spring.repositories.FactureRepo;

@Service
@Slf4j
public class FactureServiceImpl implements FactureService {
	
	@Autowired
	FactureRepo factureRepo;
	
	@Override
	public Long addFacture(Facture fact) {
	try {
		factureRepo.save(fact);
		//fact.setMontantTotal(fact.getPrixUnitaire() * fact.getReservationAttache().getNbreDePersonne());
	}catch (Exception e){
		log.error("error while saving facture : "+ e.getMessage());
	}
	log.info("save complete");

	return fact.getId();
	}

	@Override
	public Long updateFacture(Facture fact) {
		factureRepo.save(fact);
		return fact.getId();
	}

	@Override
	public List<Facture> getFactures() {
		return factureRepo.findAll();

	}

}
