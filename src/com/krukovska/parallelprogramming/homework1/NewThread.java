package com.krukovska.parallelprogramming.homework1;

public class NewThread extends Thread {

    @Override
    public void run() {
        for (var i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }

}
