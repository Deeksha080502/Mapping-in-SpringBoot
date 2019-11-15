package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.app.model.Laptop;

@Repository
public interface LaptopRepository extends JpaRepository<Laptop, Integer> {



//@Query(value = "SELECT * FROM LAPTOP WHERE ID = ?1", nativeQuery = true)
//	@Query(value ="SELECT l.lName FROM STUDENT s, Laptop l where s.LAPTOP_ID = l.ID")
//	Laptop findBylName(Integer id);



}
