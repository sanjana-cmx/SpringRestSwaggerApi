package com.spring.boot.rest.springrest.service;

import com.spring.boot.rest.springrest.beans.Student;
import com.spring.boot.rest.springrest.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    //Autowire Repository into Service
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        List<Student> students = new ArrayList<>();
        studentRepository.findAll().forEach(students::add);
        return students;
    }
    public void addStudent(Student  student){
        studentRepository.save(student);
    }
    public Student getStudentById(String id){

       // return studentRepository.findById(id);
        return  studentRepository.findOne(id);
    }

    public  void updateStudent(String id, Student student){
        studentRepository.save(student);
    }

    public void deleteStudnet(String id){

       // studentRepository.deleteById(id);
        studentRepository.delete(getStudentById(id));
    }
}
