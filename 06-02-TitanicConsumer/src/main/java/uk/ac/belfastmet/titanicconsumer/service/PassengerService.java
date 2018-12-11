package uk.ac.belfastmet.titanicconsumer.service;

import java.util.ArrayList;

import uk.ac.belfastmet.titanicconsumer.domain.Passenger;

public interface PassengerService {
	
	public ArrayList<Passenger> list();
	public Passenger get(Integer passengerId);
	public Passenger add(Passenger passenger);
	public Passenger update(Passenger passenger);
	public void delete(Integer passengerId);

}
