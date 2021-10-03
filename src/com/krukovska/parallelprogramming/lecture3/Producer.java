package com.krukovska.parallelprogramming.lecture3;

public class Producer implements Runnable {

    private final MyQueue myQueue;

    public Producer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        for (var i = 0; i < 100; i++) {
            myQueue.put(i);
        }
    }
}
