package com.krukovska.parallelprogramming.lecture3;

public class Consumer implements Runnable {

    private final MyQueue myQueue;

    public Consumer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        for (var i = 0; i < 100; i++) {
            myQueue.get();
        }
    }
}

