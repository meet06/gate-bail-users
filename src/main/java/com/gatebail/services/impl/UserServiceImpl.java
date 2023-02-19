package com.gatebail.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gatebail.exceptions.RecordNotFoundException;
import com.gatebail.models.User;
import com.gatebail.repositories.UserRepository;
import com.gatebail.repositories.UserTypeRepository;
import com.gatebail.services.UserService;


@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	UserTypeRepository userTypeRepository;
	
	@Override
	public User createUser(User user) {
		String userID = UUID.randomUUID().toString();
		user.setUserId(userID);
		
		
		
		User saveUser = userRepository.save(user);
		return saveUser;
	}

	@Override
	public User getUserById(String userId) {
		User user = userRepository.findById(userId)
				.orElseThrow(()-> 
				new RecordNotFoundException("User not found"));
		return user;
	}

	@Override
	public List<User> getAllUsers() {
		List<User> userList = userRepository.findAll();
		return userList;
	}

	@Override
	public User updateUser(User user, String userId) {
		userRepository.findById(userId)
				.orElseThrow(()-> 
				new RecordNotFoundException("User not found"));
		user.setUserId(userId);
		User updatedUser = userRepository.save(user);
		return updatedUser;
	}

	@Override
	public Boolean deleteUserById(String userId) {
		User getUserById = userRepository.findById(userId)
		.orElseThrow(()-> 
		new RecordNotFoundException("User not found"));
		try {
			userRepository.delete(getUserById);
			return true;
		} catch (Exception e) {
			throw new RecordNotFoundException("Somthing went to wrong");
		}
	}

}
