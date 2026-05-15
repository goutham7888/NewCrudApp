package com.ibm.repo;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.ibm.model.AppUser;

public interface UserRepo extends MongoRepository<AppUser, String> {

	
	public AppUser findByUsername(String username);



}
