package com.example.blogapp.model.Repository;


import com.example.blogapp.model.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
}
