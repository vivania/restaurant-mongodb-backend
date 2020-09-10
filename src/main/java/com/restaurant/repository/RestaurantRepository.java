package com.restaurant.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.restaurant.entities.Restaurant;

@CrossOrigin("*")
@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, String> {
	
	List<Restaurant> findAll();

	@Query(value = "{'id':?0}")
	Optional<Restaurant> findById(String id);
	
	@Query(value = "{}", fields= "{'id':1}")
	List<Restaurant> findRestauById(String id);
	
	//@Query(value = "{}", fields= "{'name':1, 'id':0}")
	List<Restaurant> findByName(String name);
	
	@Query(value = "{}", fields= "{'name':1, 'id':0}")
	List<Restaurant> findAllName();
	
	@Query(value = "{'specialite2': 'Pizzas'}", fields= "{'specialite2': 'Pizzas', 'name': 1, 'CP':1, 'telephone': 1, 'id': 1}")
	List<Restaurant> findAllSpeciality();
	
	
	
	
	//> db.food.find({}, {"_id":0, "CP":0, "adresse":0, "type":0, "specialite1":0, "specialite2":0, "specialite3":0, "telephone":0, "prix":0, "latitude":0, "logitude":0 }).pretty()


}
