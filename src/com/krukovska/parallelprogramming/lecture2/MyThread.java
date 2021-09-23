package com.krukovska.parallelprogramming.lecture2;

public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Important job running in " + getName());
    }

    public void run(String s) {
        System.out.println("String in run is " + s);
    }

}
