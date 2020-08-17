package com.spring.boot.rest.springrest.service;

import com.spring.boot.rest.springrest.beans.Student;
import com.spring.boot.rest.springrest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    //Autowire Repository into Service
    @Autowired
   private  StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }
    public void addStudent(Student  student){

        studentRepository.save(student);
    }

    public Optional<Student> getStudentById(String id){

       // return studentRepository.findById(id);
        return  studentRepository.findStudentById(id);
    }

    public  void updateStudent(String id, Student student){
        studentRepository.save(student);
    }

    public void deleteStudent(String id){

       // studentRepository.deleteById(id);
        studentRepository.deleteById(id);
    }

    public Optional<String> getStudentNameById(String id) {
        return studentRepository.getNameById(id);
    }

    public Optional<Student> findStudentByCriteria(String criteria){
        return studentRepository.findByCriteria(criteria);

    }
}
