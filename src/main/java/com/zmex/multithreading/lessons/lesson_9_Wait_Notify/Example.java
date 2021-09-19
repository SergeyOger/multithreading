package com.zmex.multithreading.lessons.lesson_9_Wait_Notify;


/**
 * wait() and notify() should be called from synchronized context.
 */
public class Example {

    public static void main(String[] args) throws InterruptedException {
        Producer producer = new Producer();
        producer.start();

        synchronized (producer) {
            System.out.println("Waiting for calculation results");
            producer.wait();
        }

        System.out.println("Total counter = " + producer.getCounter());
    }

    static class Producer extends Thread {

        private long counter;

        public long getCounter() {
            return counter;
        }

        @Override
        public void run() {
            synchronized (this) {
                for (int i = 0; i < 150_000; i++) {
                    counter += i;
                }

                System.out.println("Thread " + Thread.currentThread().getName() + " finished calculation.");
                notify();
            }
        }
    }
}
