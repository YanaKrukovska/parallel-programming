package com.krukovska.parallelprogramming.lecture2;

public class JoinDemo {

    public static void main(String[] args) {
        var a = new JoinRunnable("A");
        var b = new JoinRunnable("B");
        var c = new JoinRunnable("C");

        a.start();
        try {
            a.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        b.start();
        c.start();
    }
}
