package com.demo.webapp.demo.webapp.services;

import com.demo.webapp.demo.webapp.dao.StudentRepository;
import com.demo.webapp.demo.webapp.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getStudents(){
        List<Student> lsStudent;
        lsStudent = (List<Student>) studentRepository.findAll();
        return lsStudent; //test
    }
}
