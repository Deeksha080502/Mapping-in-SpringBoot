package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.app.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
//	public Laptop findBylName(String id);
//	
	
//	@Query(value ="SELECT Laptop.l_Name, Laptop.l_Id FROM Laptop INNER JOIN STUDENT s ON Laptop.ID = 1",
//			nativeQuery = true)
//	public String fetchLNameById();
	
	@Query(value ="SELECT Lap.lName, Lap.lId FROM Laptop Lap INNER JOIN Student s ON Laptop.id = 1",nativeQuery = true)
	public String fetchLNameById();
	
	//@Query(value ="SELECT l.lName,l.lId,s.name, s.rollNo,s.marks FROM Laptop l LEFT JOIN STUDENT s ON l.ID=s.LAPTOP_ID", nativeQuery = true)
	//@Query(value ="select * from student", nativeQuery = true)
	//Student findById();


}
