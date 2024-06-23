package com.example.blogapp.model.controller;


import com.example.blogapp.model.Repository.BlogPostRepository;
import com.example.blogapp.model.Repository.UserRepository;
import com.example.blogapp.model.model.BlogPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api/blogposts")
public class BlogPostController {

    @Autowired
    private BlogPostRepository blogPostRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    public List<BlogPost> getAllBlogPosts() {
        return blogPostRepository.findAll();
    }

    @PostMapping
    public BlogPost createBlogPost(@RequestBody BlogPost blogPost) {
        // Optionally, you can add logic here to handle the user
        return blogPostRepository.save(blogPost);
    }
}
