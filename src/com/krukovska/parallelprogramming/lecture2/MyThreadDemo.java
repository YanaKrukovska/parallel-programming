package com.krukovska.parallelprogramming.lecture2;

public class MyThreadDemo {

    public static void main(String[] args) {
        var myThread = new MyThread();
        myThread.start();

        var myThreadOverride = new MyThread();
        myThread.run("Second thread");
        myThreadOverride.start();
    }
}
