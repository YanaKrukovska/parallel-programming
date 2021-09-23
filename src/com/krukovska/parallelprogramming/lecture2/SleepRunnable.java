package com.krukovska.parallelprogramming.lecture2;

public class SleepRunnable implements Runnable {

    public void run() {
        for (var x = 1; x < 4; x++) {
            System.out.println("Run by "
                    + Thread.currentThread().getName()
                    + ", x is " + x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
