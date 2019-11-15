package com.example.app.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.Laptop;
import com.example.app.model.Student;
import com.example.app.repository.LaptopRepository;
import com.example.app.repository.StudentRepository;

@RestController
public class SLController {
	
	@Autowired
	StudentRepository studentRepository;
	
	@Autowired
	LaptopRepository laptopRepository;
	
	@GetMapping("/findLaptop/{laptop_id}")
	private String getLapTopName(@PathVariable(value  = "laptop_id") Integer laptop_id){
		
		Optional<Laptop> lap = laptopRepository.findById(laptop_id);
		if(lap == null) {
			System.out.println("====>"+"Not found data");
		}else {
			System.out.println("====>"+"found data");
		}
		System.out.println("====>"+lap.get().getlName());
		System.out.println("====>"+lap.get().getStudent().getMarks());
		
//		return lap.get().toString() ;
		
		return studentRepository.fetchLNameById();
	}
	
	
	@PostMapping(value = "/createLaptop")
	private Laptop CreateLapTop(){
		Laptop pLaptop =  new Laptop();
		pLaptop.setlId("101");
		pLaptop.setlName("Macbook");
		
		laptopRepository.save(pLaptop);
		
		Student student = new Student();
		student.setRollNo("1");
		student.setMarks("50");
		student.setName("Deeksha");
		student.setLaptop(pLaptop);
		
//		pLaptop.setStudent(student);
		
//	
		studentRepository.save(student);
		
		return pLaptop ;
	}
		

}
