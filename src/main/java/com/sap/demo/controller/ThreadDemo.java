package com.sap.demo.controller;

import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ThreadDemo {
    private void methodA() throws InterruptedException {
        synchronized(this) {
            System.out.println("methodA() started...");
            wait();
            System.out.println("methodA() ended...");
        }
    }
    private synchronized void methodB() throws InterruptedException {
        synchronized(this) {
            Thread.sleep(1000);
            System.out.println("methodB() started...");
            notify();
            System.out.println("methodB() ended...");
        }
    }
    public static void main(String[] args) {
        Integer[] numbers = {1,2,3,4,5,6};
        Optional<Integer> reduce = Arrays.stream(numbers)
                .reduce(Integer::sum);
        int[] numArray = {1,2,3,4,5,6};
        Arrays.stream(numArray)
                .sum();



        for(int i=0; i<numbers.length;i++)
            System.out.println(i);

        System.out.println("---------------");
        for(int i=0; i<numbers.length;++i)
            System.out.println(i);


        System.out.println(Runtime.getRuntime().availableProcessors());
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        System.out.println(forkJoinPool.getActiveThreadCount());
        System.out.println(forkJoinPool.getPoolSize());
        System.out.println(forkJoinPool.getParallelism());
        System.out.println(forkJoinPool.getRunningThreadCount());
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        ThreadDemo demo = new ThreadDemo();
        Thread t1 = new Thread(() -> { try { demo.methodA();} catch (InterruptedException e) {throw new RuntimeException(e);} });
        Thread t2 = new Thread(() -> { try { demo.methodB();} catch (InterruptedException e) {throw new RuntimeException(e);} });
        t1.start();
        t2.start();
    }
}

class Worker1 implements Runnable {
    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println("Worker 1 : " + i);
        }
    }
}

class Worker2 implements Runnable {
    @Override
    public void run() {
        for (int i=0; i<10; i++) {
            System.out.println("Worker 2 : " + i);
        }
    }
}