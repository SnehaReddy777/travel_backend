package com.travel.travelbackend.controller;

import java.util.Collection;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.travel.travelbackend.model.Travel;
import com.travel.travelbackend.service.TravelService;

@RestController
@RequestMapping(value="/api")
@CrossOrigin("*")
public class TravelController {

     @Autowired
	TravelService serv;
	
	 @PostMapping(value= "/create")
	    public String create(@RequestBody Travel std) {
	        
	        serv.createTravel(std);
	        return "Traveller records created.";
	    }
	 
	 @GetMapping(value= "/getall")
	    public Collection<Travel> getAll() {
	       
	        return serv.getAllTravel();
	    }
	 
	 @GetMapping(value= "/getbyid/{id}")
	    public Optional<Travel> getById(@PathVariable String  id) {
	        
	        return serv.findTravelById(id);
	    }
	 @PutMapping(value= "/update/{id}")
	    public String update(@PathVariable(value= "id") String id, @RequestBody Travel std) {
	        
	        std.setId(id);
	        serv.updateTravel(std);;
	        return "travel record for travel-id= " + id + " updated.";
	    }
	 
	 @DeleteMapping(value= "/delete/{id}")
	    public String delete(@PathVariable(value= "id") String id) {
	      
	        serv.deleteTravellerById(id);
	        return "Travel record for travel-id= " + id + " deleted.";
}
	 
}
