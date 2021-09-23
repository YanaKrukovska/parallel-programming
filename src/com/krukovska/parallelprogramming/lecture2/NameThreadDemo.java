package com.krukovska.parallelprogramming.lecture2;

public class NameThreadDemo {

    public static void main(String[] args) {
        var nr = new NameRunnable();
        var thread1 = new Thread(nr);
        thread1.setName("First Thread");
        thread1.start();

        var thread2 = new Thread(nr, "Second Thread");
        thread2.start();
    }

}

