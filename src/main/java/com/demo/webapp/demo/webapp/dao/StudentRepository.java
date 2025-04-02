package com.demo.webapp.demo.webapp.dao;

import com.demo.webapp.demo.webapp.entities.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
}
