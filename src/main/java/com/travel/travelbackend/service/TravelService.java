package com.travel.travelbackend.service;


import java.util.Collection;
import java.util.Optional;

import com.travel.travelbackend.model.Travel;



public interface TravelService {

	public void createTravel(Travel std);
	public Collection<Travel> getAllTravel();
	public Optional<Travel> findTravelById(String id);
	public void updateTravel(Travel std);
	public void deleteTravellerById(String id);

	
}

	