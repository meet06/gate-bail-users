package com.gatebail.services;

import java.util.List;

import com.gatebail.models.UserType;

public interface UserTypeService {

	UserType createUserType(UserType userType);
	
	UserType getUserTypeById(String userTypeId);
	
	List<UserType> getAllUserType();
	
	UserType updateUserType(UserType userType,String userTypeId);
	
	Boolean deleteUserType(String userTypeId);
}
