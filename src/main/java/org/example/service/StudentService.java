package org.example.service;

import org.example.dao.StudentRepository;
import org.example.entities.Student;
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
        return lsStudent;
    }
}
