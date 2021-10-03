package com.krukovska.parallelprogramming.homework2.task1;

public class SyncThread extends Thread {

    private final StringBuilder stringBuilder;

    public SyncThread(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void run() {
        synchronized (stringBuilder) {
            for (var i = 0; i < 100; i++) {
                System.out.print(stringBuilder);
            }
            System.out.println();

            var letter = stringBuilder.charAt(0);
            stringBuilder.setCharAt(0, ++letter);
        }
    }
}
