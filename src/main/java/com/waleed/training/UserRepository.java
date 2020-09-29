package com.waleed.training;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

//	For own methods 
//	findByXXX();
	
	List<User> findByUserName(String userName);
	
	List<User> findByUserEmail(String userEmail);
	
	
	
//	If we have to write customised queries:
	
	/*
	 * @Query(value =
	 * "select * from user where location=(select place from countries)",
	 * nativeQuery = true) List<User> searchUsers();
	 */
	
}
