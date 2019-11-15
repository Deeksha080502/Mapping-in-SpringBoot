package com.example.app.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.app.model.User;
import com.example.app.model.UserContact;
import com.example.app.repository.UserContactRepository;

@RequestMapping("/rest/userscontact")
@RestController
public class UserContactResource {

	@Autowired
	private UserContactRepository userContactRepository;

	@GetMapping(value = "/all")
	public List<UserContact> getUserContact() {
		return userContactRepository.findAll();
	}
	
	@PostMapping(value = "/saveContact")
	public UserContact getUserContact(@RequestBody UserContact userContact, String name, Integer salary, String teamName) {
		User user = new User();
		user.setName(name);
		user.setSalary(100);
		user.setTeamName("ui");
		userContact.setUser(user);
		return userContactRepository.save(userContact);
	}

	@GetMapping(value = "/update/{name}")
	public List<UserContact> updateName(@PathVariable String name) {
		
		User user = new User();
	
	     user.setTeamName("UiTeam")
		.setName(name)
		.setSalary(100000);
		
		UserContact userContact =new UserContact();
		
		userContact.setPhoneNubmer(111111)
		.setUser(user);
		
		userContactRepository.save(userContact);
		
		return userContactRepository.findAll();
	}
	
}
