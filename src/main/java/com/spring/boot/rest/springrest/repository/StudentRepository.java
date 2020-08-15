package com.spring.boot.rest.springrest.repository;

import com.spring.boot.rest.springrest.beans.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,String> {

    //Crud Methods are now available
}
