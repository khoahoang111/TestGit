package com.khoahd1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.khoahd1.entity.Form1Entity;

@Repository
public interface Form1Repository extends JpaRepository<Form1Entity, Integer> {

	List<Form1Entity> findAll();
	
}
