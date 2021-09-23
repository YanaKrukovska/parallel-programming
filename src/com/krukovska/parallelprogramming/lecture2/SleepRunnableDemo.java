package com.krukovska.parallelprogramming.lecture2;

public class SleepRunnableDemo {

    public static void main(String[] args) {
        SleepRunnable sleepRunnable = new SleepRunnable();

        var one = new Thread(sleepRunnable);
        one.setName("Fred");
        var two = new Thread(sleepRunnable);
        two.setName("Lucy");
        var three = new Thread(sleepRunnable);
        three.setName("Ricky");

        one.start();
        two.start();
        three.start();
    }
}

