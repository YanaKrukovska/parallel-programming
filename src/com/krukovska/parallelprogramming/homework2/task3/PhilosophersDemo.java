package com.krukovska.parallelprogramming.homework2.task3;

public class PhilosophersDemo {

    public static final int PHILOSOPHERS_AMOUNT = 5;

    public static void main(String[] args) {

        var philosophers = new Philosopher[PHILOSOPHERS_AMOUNT];
        var forks = new Object[philosophers.length];

        for (var i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }

        for (var i = 0; i < philosophers.length; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % forks.length];

            philosophers[i] = new Philosopher(leftFork, rightFork);

            var t = new Thread(philosophers[i], "Philosopher " + (i + 1));

            /* When priorities are different, philosopher with higher priority is more likely start before
             all philosophers pick up the fork. Also high priority philosophers are more likely to start to eating */
            if (i % 2 != 0) {
                t.setPriority(Thread.MAX_PRIORITY);
            }
            t.start();
        }
    }

}
