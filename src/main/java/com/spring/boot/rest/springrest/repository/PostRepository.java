package com.spring.boot.rest.springrest.repository;

import com.spring.boot.rest.springrest.beans.Post;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post,Integer> {

    public List<Post> findByUserId(int userId);
}
