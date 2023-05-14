package tn.esprit.spring.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.spring.entities.Reservation;
import tn.esprit.spring.repositories.ReservationRepo;
import tn.esprit.spring.services.ReservationServiceImpl;



@RestController
@RequestMapping("/res")
public class ReservationController {
	@Autowired
	ReservationServiceImpl reservationService;
	@Autowired
	ReservationRepo resRepo;
	
	@PostMapping("/addReservation")
	@ResponseBody
	public ResponseEntity addEvaluation(@RequestBody Reservation res) {
		reservationService.addReservation(res);
		return new ResponseEntity<>(res, HttpStatus.OK);

	}
	
	@GetMapping("/ReservationsList")
	@ResponseBody
	public List<Reservation> reservationsList() {
		return  reservationService.getReservations();
	}
	
}
