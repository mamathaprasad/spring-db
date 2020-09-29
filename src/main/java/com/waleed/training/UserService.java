package com.waleed.training;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository repo;
	
	Iterable<User> getAllUsers(){
		return repo.findAll();
	}
	
	Optional<User> getUserById(int id){
		return repo.findById(id);
	}
	
	List<User> getUserByName(String userName){
		return repo.findByUserName(userName);
	}
	
	List<User> getUserByEmail(String userEmail){
		return repo.findByUserEmail(userEmail);
	}
	
	
	void addUser(User user) {
		repo.save(user);
	}
	
	
	
	
	
	
	
//	All other methods as previous
	
}
