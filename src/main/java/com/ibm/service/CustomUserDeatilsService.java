package com.ibm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import com.ibm.model.AppUser;
import com.ibm.repo.UserRepo;
@Service
public  class CustomUserDeatilsService implements UserDetailsService{
@Autowired
	public UserRepo repo;
@Override
public UserDetails loadUserByUsername(String username) {
	AppUser user = repo.findByUsername(username);
	
	return User.builder().username(user.getUsername()).password(user.getPassword()).roles(user.getRole()).build();
}


}
