package com.krukovska.parallelprogramming.lecture2;

public class IsAliveDemo {

    public static void main(String[] args) throws InterruptedException {
        var myRunnable = new MyRunnable();

        var thread = new Thread(myRunnable);
        System.out.println("Before starting: " + thread.isAlive());
        thread.start();
        System.out.println("After starting: " + thread.isAlive());
        thread.join();
        System.out.println("After thread completed: " + thread.isAlive());
    }
}

