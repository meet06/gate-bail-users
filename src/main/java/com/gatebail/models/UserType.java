package com.gatebail.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "user_type")
@AllArgsConstructor
@NoArgsConstructor
public class UserType {
	
	@Id
	@Column(name = "user_type_id")
	private String userTypeId;
	@Column(name = "user_type_name")
	private String userTypeName;
	@Column(name = "is_active",columnDefinition = "tinyInt(1) default 1")
	private int isActive;
}
