package com.krukovska.parallelprogramming.homework2.task2;

public class ProducerDemo {

    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue<>();

        var consumer1 = new Consumer<>(myQueue);
        var consumer2 = new Consumer<>(myQueue);
        var producer = new Producer(myQueue);

        var t1 = new Thread(consumer1, "Consumer 1");
        var t2 = new Thread(consumer2, "Consumer 2");
        var t3 = new Thread(producer);

        t1.start();
        t2.start();
        t3.start();
    }
}

