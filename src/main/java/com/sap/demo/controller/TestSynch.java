package com.sap.demo.controller;

public class TestSynch {
    private Object object = new Object();
    public static void main(String[] args) {
        TestSynch testSynch = new TestSynch();
        testSynch.sayGoodMorning();
    }

    private String sayGoodMorning() {
        synchronized (object) {
            System.out.println("GoodMorning");
            sayGoodEvening();
            System.out.println("GoodMorning Ends");
        }
        return "";
    }

    private String sayGoodEvening() {
        synchronized (object) {
            System.out.println("GoodEvening");
        }
        return "";
    }
}
