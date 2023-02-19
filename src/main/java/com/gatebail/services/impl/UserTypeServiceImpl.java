package com.gatebail.services.impl;

import java.util.List;
import java.util.UUID;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gatebail.models.UserType;
import com.gatebail.repositories.UserTypeRepository;
import com.gatebail.services.UserTypeService;

@Service
public class UserTypeServiceImpl implements UserTypeService {

	@Autowired
	UserTypeRepository userTypeRepository;

	@PostConstruct
	public void addUserTypeDataIntoDb() {
		List<UserType> findAll = userTypeRepository.findAll();
		if (findAll.size() == 0) {
			List<UserType> userType = List.of(new UserType(UUID.randomUUID().toString(), "Member", 1),
					new UserType(UUID.randomUUID().toString(), "Admin", 1),
					new UserType(UUID.randomUUID().toString(), "Gate Keeper", 1),
					new UserType(UUID.randomUUID().toString(), "Super Admin", 1));
			userTypeRepository.saveAll(userType);
		}

	}

	@Override
	public UserType createUserType(UserType userType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserType getUserTypeById(String userTypeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<UserType> getAllUserType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserType updateUserType(UserType userType, String userTypeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteUserType(String userTypeId) {
		// TODO Auto-generated method stub
		return null;
	}
}
