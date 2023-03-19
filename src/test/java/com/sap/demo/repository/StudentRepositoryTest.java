package com.sap.demo.repository;

import com.sap.demo.model.Student;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    public void test() {
        Student student = Student.builder()
                .firstName("Prabu")
                .lastName("Subramaniam")
                .build();
        studentRepository.save(student);
        Assertions.assertThat(studentRepository.findById(student.getId()).get().getFirstName()).isEqualTo("Prabu");
    }
}
