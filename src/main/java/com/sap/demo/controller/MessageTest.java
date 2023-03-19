package com.sap.demo.controller;

public class MessageTest {
    public static void main(String[] args) {
        Message message = new Message();

        Thread producer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                message.setMessage("Message " + i);
            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                String messageText = message.getMessage();
                System.out.println("Received message: " + messageText);
            }
        });

        producer.start();
        consumer.start();
    }
}
