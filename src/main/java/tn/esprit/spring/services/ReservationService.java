package tn.esprit.spring.services;

import java.util.List;
import tn.esprit.spring.entities.Reservation;


public interface ReservationService {
	Long addReservation(Reservation res);

	Long updateReservation (Reservation res);
	
	List<Reservation> getReservations();
	
	void cancelReservation(Long id);
	
	Long countRservations();


}
