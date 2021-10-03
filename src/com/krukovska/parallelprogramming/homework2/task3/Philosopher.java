package com.krukovska.parallelprogramming.homework2.task3;

public class Philosopher implements Runnable {

    private final Object leftFork;
    private final Object rightFork;

    public Philosopher(Object leftFork, Object rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    @Override
    public void run() {
        try {
            while (true) {
                doAction("Thinking");
                synchronized (leftFork) {
                    doAction("Picked up left fork");
                    synchronized (rightFork) {
                        doAction("Picked up right fork. Start eating");
                        doAction("Put down right fork");
                    }
                    doAction("Put down left fork. Back to thinking");
                }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private void doAction(String action) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + ", priority=" + Thread.currentThread().getPriority() + ": " + action);
        Thread.sleep(((int) (Math.random() * 100)));
    }
}
