package com.sap.demo.controller;

import com.sap.demo.model.Student;
import com.sap.demo.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentsController {
    @Autowired
    private StudentsService studentsService;

    @Autowired
    @Qualifier("name")
    private String profileName;

    List<Student> students = List.of(new Student(1L,"Prabu", "Maniam"));

    @GetMapping("/name")
    public String getProfileName() {
        return profileName;
    }

    @PostMapping
    public Student enrollStudent(@RequestBody Student student) {
        Student studentEnrolled = studentsService.saveStudent(student);
        return studentEnrolled;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentByName (@PathVariable Long id) {
        return ResponseEntity.ok(studentsService.getStudentById(id));
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return studentsService.getAllStudents();
    }

}
