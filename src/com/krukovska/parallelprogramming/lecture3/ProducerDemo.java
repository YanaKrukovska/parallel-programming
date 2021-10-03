package com.krukovska.parallelprogramming.lecture3;

public class ProducerDemo {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        Consumer consumer = new Consumer(myQueue);
        Producer producer = new Producer(myQueue);

        var t1 = new Thread(consumer);
        var t2 = new Thread(producer);

        t1.start();
        t2.start();
    }
}

