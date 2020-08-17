package com.spring.boot.rest.springrest.controller;

import com.spring.boot.rest.springrest.beans.Student;
import com.spring.boot.rest.springrest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping("/students/{id}")
    public Optional<Student> getStudentById(@PathVariable String id){

        //return studentService.getStudentById(id);
        return  studentService.getStudentById(id);
    }
    @GetMapping("/students/name/{id}")
    public Optional<String> getStNameById(@PathVariable String id){

        //return studentService.getStudentById(id);
        return  studentService.getStudentNameById(id);
    }

    @GetMapping("/students/criteria/{criteria}")
    public Optional<Student> getStudentByCriteria(@PathVariable String criteria){

        //return studentService.getStudentById(id);
        return  studentService.findStudentByCriteria(criteria);
    }
    @PostMapping("/students")
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }
    @PutMapping("/students/{id}")
    public void updateStudent(@RequestBody Student student,@PathVariable String id){
        studentService.updateStudent(id,student);
    }
    @DeleteMapping("/students/{id}")
    public void deleteStudent(@PathVariable String id){
        studentService.deleteStudent(id);
    }

}
