package com.spring.boot.rest.springrest.service;

import com.spring.boot.rest.springrest.beans.Post;
import com.spring.boot.rest.springrest.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    @Autowired
   private PostRepository postRepository;

    public List<Post> getAllPost(){
        List<Post> posts = new ArrayList<>();
        postRepository.findAll()
                .forEach(posts::add);
        return  posts;
    }
    public List<Post> getPostByUserId(int id){
        List<Post> posts = new ArrayList<>();
        postRepository.findByUserId(id)
                .forEach(posts::add);
        return  posts;
    }

    public Optional<Post> getPostById(int id){
         return postRepository.findById(id);
    }

    public void addPost(Post post){
        postRepository.save(post);
    }

    public  void deletePost(int id){
        postRepository.deleteById(id);
    }

    public void updatePost(int id,Post post){
        postRepository.save(post);
    }

}
