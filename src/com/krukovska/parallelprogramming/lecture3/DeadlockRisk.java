package com.krukovska.parallelprogramming.lecture3;

public class DeadlockRisk implements Runnable {

    private static class Resource {
    }

    private final Resource scissors = new Resource();
    private final Resource paper = new Resource();

    public void doSun() {
        synchronized (scissors) { // May deadlock here
            System.out.println(Thread.currentThread().getName() + " взяла ножиці для вирізання сонечка");
            synchronized (paper) {
                System.out.println(Thread.currentThread().getName() + " взяла папір для вирізання сонечка");
                System.out.println(Thread.currentThread().getName() + " вирізає сонечко");
            }
        }
    }

    public void doCloud() {
        synchronized (paper) { // May deadlock here
            System.out.println(Thread.currentThread().getName() + " взяла папір для вирізання хмаринки");
            synchronized (scissors) {
                System.out.println(Thread.currentThread().getName() + " взяла ножиці для вирізання хмаринки");
                System.out.println(Thread.currentThread().getName() + " вирізає хмаринку");
            }
        }
    }

    public void run() {
        doSun();
        doCloud();
    }

    public static void main(String[] args) {
        var job = new DeadlockRisk();
        var masha = new Thread(job, "Маша");
        var dasha = new Thread(job, "Даша");
        masha.start();
        dasha.start();
    }
}
