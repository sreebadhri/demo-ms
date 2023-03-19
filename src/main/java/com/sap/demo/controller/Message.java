package com.sap.demo.controller;

public class Message {
    private String message;
    private boolean isMessageAvailable = false;

    public synchronized void setMessage(String message) {
        while (isMessageAvailable) { // check if message is already available
            System.out.println("Inside while... message is not consumed yet...");
            try {
                wait(); // wait until message is consumed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.message = message;
        isMessageAvailable = true;
        notifyAll(); // notify waiting threads that message is available
    }

    public synchronized String getMessage() {
        while (!isMessageAvailable) { // check if message is available
            try {
                wait(); // wait until message is available
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        String message = this.message;
        isMessageAvailable = false;
        notifyAll(); // notify waiting threads that message has been consumed
        return message;
    }
}
