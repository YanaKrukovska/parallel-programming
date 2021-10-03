package com.krukovska.parallelprogramming.homework2.task2;

public class Producer implements Runnable {

    private final MyQueue<Integer> myQueue;

    public Producer(MyQueue<Integer> myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        for (var i = 0; i < 100; i++) {
            myQueue.put(i);
        }
    }
}
