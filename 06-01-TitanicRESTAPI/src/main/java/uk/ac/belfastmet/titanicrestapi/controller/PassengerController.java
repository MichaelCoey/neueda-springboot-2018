package uk.ac.belfastmet.titanicrestapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uk.ac.belfastmet.titanicrestapi.domain.Passenger;
import uk.ac.belfastmet.titanicrestapi.repository.PassengerRepository;

@RestController
@RequestMapping("")
public class PassengerController {
	
	@Autowired
	PassengerRepository passengerRepository;
	
	public PassengerController(PassengerRepository passengerRepository) {
		super();
		this.passengerRepository = passengerRepository;
	}

	@GetMapping("passengers")
	public Iterable<Passenger> getAllPassengers() {
		
		
		
		return this.passengerRepository.findAll();
	}
	
	@GetMapping("passenger/{passengerId}")
	public Iterable<Passenger> getPassenger(@PathVariable("passengerId") Integer passengerId) {
		
		
		
		return this.passengerRepository.findByPassengerId(passengerId);
	}
	
	
	@DeleteMapping("passenger/{passengerId}")
	public String deletePassenger(@PathVariable("passengerId") Integer passengerId) {
		
		
		
		this.passengerRepository.deleteById(passengerId);
		return "{\"Delete\": \"Success\", \"Passenger\": " + passengerId + "}";
	}
	
	
	@PutMapping("passengers/{passengerId}")
	public Passenger updatePassenger(@PathVariable("passengerId") Integer passengerId, @RequestBody Passenger passenger) {
		
		
		return this.passengerRepository.save(passenger);
	}
	
	
	@PostMapping("passengers/")
	private Passenger addPassengers(@RequestBody Passenger passenger) {
		
		
		
		return this.passengerRepository.save(passenger);
	}
	
//	@PostMapping("passengers")
//	private String postAllPassengers() {
//		
//		
//		
//		return "Posting a message to Passengers";
//	}
	
	

}
