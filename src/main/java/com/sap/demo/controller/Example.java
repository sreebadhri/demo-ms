package com.sap.demo.controller;

import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadLocalRandom;

public class Example {
    private int count = 5;
    public static void main(String[] args) throws InterruptedException {
//        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
        HashMap<String, String> map = new HashMap<>();
        map.put("key1", "value1");
        map.put("key2", "value2");
        map.put("key3", "value3");

//        for (String key : map.keySet()) {
//            if (key.equals("key2")) {
//                map.remove(key); // This is safe with ConcurrentHashMap
//            }
//        }
        for(String name : map.keySet()) {
            map.remove(name);
        }
        System.out.println(map);


//        Random random = new Random();
//        Object o = new Object();
//        o.wait();
//        Example example = new Example();
//        example.methodA();
    }
    public synchronized void methodA() {
        System.out.println("Method A start : " + count);
        count = count-1;
        if(count != 0) {
            methodA();
        }
        System.out.println("Method A end");
    }

    public synchronized void methodB() {
        System.out.println("Method B");
    }
}
