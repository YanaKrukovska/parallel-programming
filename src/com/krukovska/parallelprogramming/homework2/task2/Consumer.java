package com.krukovska.parallelprogramming.homework2.task2;

public class Consumer<T> implements Runnable {

    private final MyQueue<T> myQueue;

    public Consumer(MyQueue<T> myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        while (true) {
            myQueue.get();
            try {
                Thread.sleep((long) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

