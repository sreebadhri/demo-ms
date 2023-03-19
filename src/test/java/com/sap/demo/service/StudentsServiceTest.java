package com.sap.demo.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StudentsServiceTest {
    @Test
    public void getNameTest() {
        StudentsService studentsService = new StudentsService();
        String name = studentsService.getName("Prabu");
        Assertions.assertEquals("Hello Prabu" , name);
    }
}
