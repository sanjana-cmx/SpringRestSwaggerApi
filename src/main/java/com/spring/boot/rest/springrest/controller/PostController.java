package com.spring.boot.rest.springrest.controller;

import com.spring.boot.rest.springrest.beans.Post;
import com.spring.boot.rest.springrest.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/post")
    public List<Post> getAllPosts(){
        return  postService.getAllPost();
    }
    @GetMapping("/post/user/{id}")
    public List<Post> getPostsByUser(@PathVariable int id){
        return  postService.getPostByUserId(id);
    }
    @GetMapping("/post/{id}")
    public Post getPostById(@PathVariable int id){
        return postService.getPostById(id);
    }
    @PostMapping("/addPost")
    public void addPost(@RequestBody Post post){
        postService.addPost(post);
    }
    @PutMapping("post/{id}")
    public void updatePost(@PathVariable int id ,@RequestBody Post post){
        postService.updatePost(id,post);
    }

    @DeleteMapping("/post{id}")
    public void deletePost(@PathVariable int id){
        postService.deletePost(id);
    }

}
