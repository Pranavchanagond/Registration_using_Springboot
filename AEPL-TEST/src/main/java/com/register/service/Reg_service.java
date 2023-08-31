package com.register.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.register.dto.Reg_table;
import com.register.repository.Reg_repository;

@Service
public class Reg_service {
	
	@Autowired
	private Reg_repository reg_repository;
	
	public boolean register(Reg_table table,long mno) {	
		boolean check=reg_repository.existsById(mno);
		if(!check) {
			reg_repository.save(table);
			return false;
		}
		else {
			return true;
		}
	}
}
