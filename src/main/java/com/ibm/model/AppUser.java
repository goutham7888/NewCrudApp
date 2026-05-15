package com.ibm.model;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data@AllArgsConstructor@NoArgsConstructor
public class AppUser {
	@Id
	 String id;
	String username;
	String password;
	String role;
}

