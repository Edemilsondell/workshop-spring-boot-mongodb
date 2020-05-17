package com.ednick22.workshop.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ednick22.workshop.domain.Post;
import com.ednick22.workshop.repository.PostRepository;
import com.ednick22.workshop.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;

	

	public Optional<Post> findById(String id) {
		Optional<Post> user = repo.findById(id);
		if (user == null) {
			throw new ObjectNotFoundException("Objeto não encontrado");
		}
		return user;
	}

}