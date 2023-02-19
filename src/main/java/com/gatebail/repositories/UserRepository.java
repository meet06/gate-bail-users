package com.gatebail.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gatebail.models.User;

public interface UserRepository extends JpaRepository<User, String> {

}
