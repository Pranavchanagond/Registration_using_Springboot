package com.register.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.register.dto.Reg_table;

@Repository
@Component
public interface Reg_repository extends JpaRepository<Reg_table, Long>{

}
