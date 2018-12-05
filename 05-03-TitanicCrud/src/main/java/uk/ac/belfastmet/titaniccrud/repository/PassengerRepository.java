package uk.ac.belfastmet.titaniccrud.repository;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import uk.ac.belfastmet.titaniccrud.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {
	
	
	//Query
	//ArrayList<Passenger> findByName(String name);

	Passenger findByPassengerId(Integer passengerId);

	ArrayList<Passenger> findByNameContaining(String name);


}
