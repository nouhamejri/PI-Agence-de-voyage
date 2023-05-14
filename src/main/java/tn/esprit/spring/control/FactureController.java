package tn.esprit.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Facture;
import tn.esprit.spring.repositories.FactureRepo;
import tn.esprit.spring.services.FactureServiceImpl;

@RestController
@RequestMapping("/facture")
public class FactureController {
	@Autowired
	FactureServiceImpl factureServiceImpl;
	@Autowired
	FactureRepo factRepo;
	
	@PostMapping("/addFacture")
	@ResponseBody
	public ResponseEntity addFacture(@RequestBody Facture fact) {
		factureServiceImpl.addFacture(fact);
		return new ResponseEntity<>(fact, HttpStatus.OK);
	}
	
	@GetMapping("/FactureList")
	@ResponseBody
	public List<Facture> FacturesList() {
		return  factureServiceImpl.getFactures();
	}
}
