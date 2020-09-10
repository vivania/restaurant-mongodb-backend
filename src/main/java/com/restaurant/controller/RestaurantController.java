package com.restaurant.controller;

import java.util.List;
import java.util.Optional;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.restaurant.entities.Restaurant;
import com.restaurant.repository.RestaurantRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class RestaurantController {
	
	
	@Autowired
	private RestaurantRepository restaurantRepository;
	
	@RequestMapping(value = "/food", method = RequestMethod.GET)
	public List<Restaurant> getAllRestaurant(){
		return restaurantRepository.findAll();
	}
	
	@GetMapping("/getId/{_id}")
	public Optional<Restaurant> getById(@PathVariable("_id") String id){
		 String changeId =  id.toString();
		 System.out.println(changeId);
		return restaurantRepository.findById(changeId);
	}
	
	@GetMapping("/restaurantId/{id}")
	public List<Restaurant> getRestaurantById(@PathVariable("id") String id){
		 String changeId =  id.toString();
		 System.out.println(changeId);
		return restaurantRepository.findRestauById(changeId);
	}
	
	@GetMapping("/name/{name}")
	public List<Restaurant> findByName(@PathVariable("name")String name){

		return restaurantRepository.findByName(name);
	}
	
	@GetMapping("/allName")
	public List<Restaurant> findAllByName(){
		return restaurantRepository.findAllName();
	}
	
	@GetMapping("/allSpecialite")
	public List<Restaurant> findSpeciality(){
		return restaurantRepository.findAllSpeciality();
	}

}
