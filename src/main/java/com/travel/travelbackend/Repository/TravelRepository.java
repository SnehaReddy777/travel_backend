package com.travel.travelbackend.Repository;



import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.travel.travelbackend.model.Travel;

@Repository
public interface TravelRepository extends MongoRepository<Travel, String>{

	Optional<Travel> findById(String id);

	

}