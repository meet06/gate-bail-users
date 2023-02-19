package com.gatebail.dto;

import lombok.Data;

@Data
public class UserDto {
	
	private String userId;
	private String firstName;
	private String lastName;
	private String email;
	private String phone;
	private String password;
	private String userTypeId;
}
