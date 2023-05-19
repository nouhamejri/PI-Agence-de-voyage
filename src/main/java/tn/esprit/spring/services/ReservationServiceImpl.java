package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entities.Reservation;
import tn.esprit.spring.repositories.ReservationRepo;

@Service
@Slf4j
public class ReservationServiceImpl implements ReservationService  {
	
	@Autowired
	ReservationRepo resRepo;
	
	@Override
	public Long addReservation(Reservation res) {
		try {
			resRepo.save(res);
		}catch (Exception e){
			log.error("error while reservation : "+ e.getMessage());
		}
		log.info("save complete");

		return res.getId();
	}

	@Override
	public Long updateReservation(Reservation res) {
		resRepo.save(res);
		return res.getId();
	}

	@Override
	public List<Reservation> getReservations() {
		return resRepo.findAll();

	}
	
	@Override
	public void cancelReservation(Long id) {
		try {
			resRepo.deleteById(id);
		}catch (Exception e) {
			log.error("error while cancel Reservation "+e.getMessage());
		}
		
	}

	@Override
	public Long countRservations() {
		return resRepo.countRservations();
	}

}
