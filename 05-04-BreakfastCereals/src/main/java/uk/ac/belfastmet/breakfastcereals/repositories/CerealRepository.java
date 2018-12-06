package uk.ac.belfastmet.breakfastcereals.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import uk.ac.belfastmet.breakfastcereals.domain.Cereal;

public interface CerealRepository extends CrudRepository<Cereal, Integer> {

	Object findByCerealId(Integer cerealId);

	Iterable<Cereal> findByManufacturerContaining(String manufacturer);

	

	

	
	
	

}
