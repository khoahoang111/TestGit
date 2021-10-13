package com.khoahd1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;


import com.khoahd1.entity.Form2Entity;

@Repository
public interface Form2Repository extends JpaRepository<Form2Entity, Integer> {
	
	
	
	@Query(value = "SELECT * FROM dbo.Form2Entity WHERE tenKH=:tenkh OR soDienthoai=:sdt", nativeQuery = true)
	List<Form2Entity> findByTenKHORSoDienthoai(@Param("tenkh")String tenkh,@Param("sdt")String sdt);
}
