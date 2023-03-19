package com.sap.demo.controller;

import org.springframework.beans.BeanUtils;

import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierExample {
    public static void main(String[] args) {
        int numThreads = 3;
        CyclicBarrier barrier = new CyclicBarrier(numThreads, () -> {
            System.out.println("All threads have reached the barrier!");
        });

        for (int i = 0; i < 4; i++) {
            new Thread(() -> {
                try {
                    System.out.println(Thread.currentThread().getName() + " has reached the barrier.");
                    barrier.await();
                    System.out.println(Thread.currentThread().getName() + " has passed the barrier.");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
