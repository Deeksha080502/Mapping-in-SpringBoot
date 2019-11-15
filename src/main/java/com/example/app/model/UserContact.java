package com.example.app.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;


@Entity
public class UserContact {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private Integer phoneNubmer;


	
//	@OneToOne()
//	@JoinColumn(name="ID")
	@OneToOne
	 @JoinTable(name = "MY_JOIN_TABLE",
     joinColumns = {
             @JoinColumn(name = "USER_ID", referencedColumnName = "ID")
     },
     inverseJoinColumns = {
             @JoinColumn(name = "CONTACT_ID", referencedColumnName = "ID", unique = true)
     }
)
	private User user;

	public User getUser() {
		return user;
	}

	public UserContact setUser(User user) {
		this.user = user;
		return this;
	}

	public Integer getId() {
		return id;
	}

	public UserContact setId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getPhoneNubmer() {
		return phoneNubmer;
	}

	public UserContact setPhoneNubmer(Integer phoneNubmer) {
		this.phoneNubmer = phoneNubmer;
		return this;
	}

}
