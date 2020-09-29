package com.waleed.training;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins="*" , allowedHeaders = "*")
@RestController
public class UserController {
	
	@Autowired
	UserService service;

	@RequestMapping("/users")
	Iterable<User> getAllUsers(){
		return service.getAllUsers();
	}
	
	@RequestMapping("/users/{id}")
	Optional<User> getUserById(@PathVariable int id){
		return service.getUserById(id);
	}
	
	@RequestMapping("/users/name/{userName}")
	List<User> getUserByName(@PathVariable String userName){
		return service.getUserByName(userName);
	}
	
	
	@RequestMapping("/users/email/{userEmail}")
	List<User> getUserByEmail(@PathVariable String userEmail){
		return service.getUserByEmail(userEmail);
	}
	
	
	
	
	@RequestMapping(method = RequestMethod.POST, value = "/users")
	void addUser(@RequestBody User user) {
		service.addUser(user);
	}
	
	
	
	
	
	
	
	
//	All other Request Mappings are the same as for the previous project
	
	
}
