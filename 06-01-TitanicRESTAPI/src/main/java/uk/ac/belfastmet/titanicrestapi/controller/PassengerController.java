package uk.ac.belfastmet.titanicrestapi.controller;

import java.util.HashMap;
import java.util.Map;

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
	public Map<String, Object> getAllPassengers() {
		
		Map<String, Object> passengersMap = new HashMap<String, Object>();
		
		passengersMap.put("allPassengers", this.passengerRepository.findAll());
		
		return passengersMap;
	}
	

	
	@GetMapping("passengers/{passengerId}")
	public Passenger getPassenger(@PathVariable("passengerId") Integer passengerId) {
		
		
		
		return this.passengerRepository.findByPassengerId(passengerId);
	}
	
	
	@DeleteMapping("passengers/{passengerId}")
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
