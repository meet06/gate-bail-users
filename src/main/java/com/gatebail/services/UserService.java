package com.gatebail.services;

import java.util.List;

import com.gatebail.models.User;

public interface UserService {

	User createUser(User user);
	
	User getUserById(String userId);
	
	List<User> getAllUsers();
	
	User updateUser(User user,String userId);
	
	Boolean deleteUserById(String userId);
	
}
