package com.register.dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity(name = "aepl_user_registartion")
@Data
public class Reg_table {
	
	private String name;
	private String email;
	@Id
	private long mnumber;
	private String dob;
	private String location;
	private String document;
	
}
