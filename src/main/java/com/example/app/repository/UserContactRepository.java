package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.model.UserContact;


public interface UserContactRepository  extends JpaRepository<UserContact,Integer> { 

}
