package uk.ac.belfastmet.titanicrestapi.repository;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.titanicrestapi.domain.Passenger;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {

	Iterable<Passenger> findByPassengerId(Integer passengerId);

}
