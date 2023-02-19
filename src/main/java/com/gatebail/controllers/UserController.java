package com.gatebail.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gatebail.models.User;
import com.gatebail.services.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	UserService userService;

	
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user)
	{
		User createUser = userService.createUser(user);
		return new ResponseEntity<User>(createUser, HttpStatus.OK);
	}
	
	@GetMapping("/{userId}")
	public ResponseEntity<User> getUserById(@PathVariable String userId)
	{
		User user = userService.getUserById(userId);
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<User>> getAllUser()
	{
		List<User> userList = userService.getAllUsers();
		return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
	}
	
	@PutMapping("/{userId}")
	public ResponseEntity<User> updateUser(@PathVariable String userId,@RequestBody User user)
	{
		User updateUser = userService.updateUser(user, userId);
		return new ResponseEntity<User>(updateUser, HttpStatus.OK);
	}
	
	@SuppressWarnings("rawtypes")
	@DeleteMapping("/{userId}")
	public ResponseEntity updateUser(@PathVariable String userId)
	{
		userService.deleteUserById(userId);
		return ResponseEntity.ok(null);
	}
}
