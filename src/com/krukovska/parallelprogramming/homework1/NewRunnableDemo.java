package com.krukovska.parallelprogramming.homework1;

public class NewRunnableDemo {

    public static void main(String[] args) {
        var newRunnable = new NewRunnable();
        var thread1 = new Thread(newRunnable);
        var thread2 = new Thread(newRunnable);
        var thread3 = new Thread(newRunnable);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
