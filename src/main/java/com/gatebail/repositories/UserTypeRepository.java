package com.gatebail.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gatebail.models.UserType;

public interface UserTypeRepository extends JpaRepository<UserType, String> {

}
