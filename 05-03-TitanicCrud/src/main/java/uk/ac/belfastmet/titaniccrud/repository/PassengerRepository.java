package uk.ac.belfastmet.titaniccrud.repository;

import org.springframework.data.repository.CrudRepository;
import uk.ac.belfastmet.titaniccrud.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {
	
	Iterable<Passenger> findByName(String name);

	Passenger findByPassengerId(Integer passengerId);

	Iterable<Passenger> findByNameContaining(String name);


}
