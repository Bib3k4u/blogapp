package com.example.blogapp.model.Repository;


import com.example.blogapp.model.model.BlogPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BlogPostRepository extends MongoRepository<BlogPost, String> {
}

