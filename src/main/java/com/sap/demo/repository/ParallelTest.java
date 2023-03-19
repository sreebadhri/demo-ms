package com.sap.demo.repository;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.time.LocalDateTime;

//@Execution(ExecutionMode.CONCURRENT)
public class ParallelTest {

    @Test
    public void testMethodOne() {
        System.out.println("testMethodOne------" + LocalDateTime.now());
    }

    @Test
    public void testMethodTwo() {
        System.out.println("testMethodTwo------" + LocalDateTime.now());
    }
}
