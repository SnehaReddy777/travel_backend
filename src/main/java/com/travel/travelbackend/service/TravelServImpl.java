package com.travel.travelbackend.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.travel.travelbackend.Repository.TravelRepository;
import com.travel.travelbackend.model.Travel;

@Service
public class TravelServImpl implements TravelService {

	
	@Autowired
    TravelRepository repo;

	@Override
	public void createTravel(Travel std) {
		// TODO Auto-generated method stub
		repo.save(std);
	}

	@Override
	public Collection<Travel> getAllTravel() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Optional<Travel> findTravelById(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public void updateTravel(Travel std) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTravellerById(String id) {
		// TODO Auto-generated method stub
		
	}



}
