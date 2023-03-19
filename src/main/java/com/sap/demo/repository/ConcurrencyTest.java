package com.sap.demo.repository;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrencyTest {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CountDownLatch latch1 = new CountDownLatch(20);
        CountDownLatch latch2 = new CountDownLatch(5);
        for (int i=0; i<20; i++){
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName());
                latch1.countDown();
            });

        }
        for (int i=21; i<26; i++){
            executorService.submit(() -> {
                System.out.println(Thread.currentThread().getName());
                latch2.countDown();
            });
        }
        try {
            latch1.await();
            latch2.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Done");
    }
}
