package com.krukovska.parallelprogramming.homework2.task1;

public class SyncDemo {

    public static void main(String[] args) {
        var stringBuilder = new StringBuilder("a");

        var t1 = new SyncThread(stringBuilder);
        var t2 = new SyncThread(stringBuilder);
        var t3 = new SyncThread(stringBuilder);

        t1.start();
        t2.start();
        t3.start();
    }
}
