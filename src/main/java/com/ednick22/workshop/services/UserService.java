package com.ednick22.workshop.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ednick22.workshop.domain.User;
import com.ednick22.workshop.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
		
	public List<User> findAll(){
		return repo.findAll();
	}

}
