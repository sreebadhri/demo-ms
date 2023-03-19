package com.sap.demo.service;

import com.sap.demo.model.Student;
import com.sap.demo.repository.StudentRepository;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentsService {
    @Autowired
    StudentRepository studentRepository;

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    public String getName(String name){
        return "Hello " + name;
    }
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
