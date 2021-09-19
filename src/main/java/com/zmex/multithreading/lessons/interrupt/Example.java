package com.zmex.multithreading.lessons.interrupt;

public class Example {

    public static void main(String[] args) throws InterruptedException {

        final InterruptableJob interruptableJob = new InterruptableJob();
        interruptableJob.start();
        Thread.sleep(200);
        interruptableJob.interrupt();

    }

    static class InterruptableJob extends Thread {

        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " started");
                Thread.sleep(600000);
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted");
            }
        }
    }
}
