package com.ibm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ibm.model.AppUser;
import com.ibm.repo.UserRepo;
@Service
public class UserService {
@Autowired
	public UserRepo repo;
@Autowired
public PasswordEncoder passwordEncoder;

	public void addUser(AppUser appuser) {
	    appuser.setPassword(passwordEncoder.encode(appuser.getPassword()));
	    repo.save(appuser);

}
//
//public long deleteStudent(String name) {
//	// TODO Auto-generated method stub
//	return repo.deleteByName(name);
//	
//}
//
//public Student getStudentByName(String name) {
//	// TODO Auto-generated method stub
//	return repo.getStudentByName(name);
//}
//
//public List<Student> getAll() {
//	// TODO Auto-generated method stub
//	return repo.findAll();
//}

	public List<AppUser> getAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

//public void updateStudent(String id) {
//	// TODO Auto-generated method stub
//	repo.deleteById(id);;
//	
//}
}
