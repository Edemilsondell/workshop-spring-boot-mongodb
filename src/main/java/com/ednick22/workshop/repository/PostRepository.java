package com.ednick22.workshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.ednick22.workshop.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

}
