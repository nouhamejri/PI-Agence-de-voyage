package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.spring.entities.Reservation;


@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Long> {

}
