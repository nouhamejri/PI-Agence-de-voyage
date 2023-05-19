package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import tn.esprit.spring.entities.Reservation;


@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Long> {
	@Query("Select "
			+ "count(r) from Reservation r ")
	public Long countRservations();

}
