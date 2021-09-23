package com.krukovska.parallelprogramming.homework1;

public class NewRunnable implements Runnable {

    @Override
    public void run() {
        for (var i = 0; i <= 100; i++) {
            if (i % 10 == 0) {
                System.out.println(Thread.currentThread().getName() + ": " + i);

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
