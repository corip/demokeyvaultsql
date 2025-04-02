package com.demo.webapp.demo.webapp.controller;

import com.demo.webapp.demo.webapp.services.StudentService;
import com.demo.webapp.demo.webapp.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping()
    public List<Student> getStudents(){
        System.out.println("hola");
        return studentService.getStudents();
    }

    @PostMapping
    public void setStudents(){
        System.out.println("Hola");
    }
}
