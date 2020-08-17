package com.spring.boot.rest.springrest.repository;

import com.spring.boot.rest.springrest.beans.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student,String> {

    //Crud Methods are now available
    @Query("SELECT t.name FROM Student t where t.id = :id")
    public Optional<String> getNameById(@Param("id")String id);
  @Query("SELECT t FROM Student t where t.id = :id")
    public Optional<Student> findStudentById(@Param("id")String id);

    @Query("SELECT t FROM Student t where t.name like %:criteria%")
    public Optional<Student> findByCriteria(String criteria);
}
