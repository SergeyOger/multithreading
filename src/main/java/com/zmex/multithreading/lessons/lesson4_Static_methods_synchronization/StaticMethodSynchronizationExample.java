package com.zmex.multithreading.lessons.lesson4_Static_methods_synchronization;

public class StaticMethodSynchronizationExample {

    public static void main(String[] args) throws InterruptedException {

        StaticResourceSupplier staticResourceSupplier = new StaticResourceSupplier();
        StaticResourceSupplier staticResourceSupplier1 = new StaticResourceSupplier();
        StaticResourceSupplier staticResourceSupplier2 = new StaticResourceSupplier();
        StaticResourceSupplier staticResourceSupplier3 = new StaticResourceSupplier();
        StaticResourceSupplier staticResourceSupplier4 = new StaticResourceSupplier();
        StaticResourceSupplier staticResourceSupplier5 = new StaticResourceSupplier();

        staticResourceSupplier.start();
        staticResourceSupplier1.start();
        staticResourceSupplier2.start();
        staticResourceSupplier3.start();
        staticResourceSupplier4.start();
        staticResourceSupplier5.start();

        staticResourceSupplier.join();
        staticResourceSupplier1.join();
        staticResourceSupplier2.join();
        staticResourceSupplier3.join();
        staticResourceSupplier4.join();
        staticResourceSupplier5.join();

        System.out.println("Total value " + StaticResource.getCounter());
    }
}

class StaticResourceSupplier extends Thread {

    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " started");
        StaticResource.incrementCounter();
    }
}

/*
Just remove * synchronized * and you will get a lot of fun)
 */
class StaticResource {

    private static int counter;

    public static synchronized void incrementCounter() {
        int currentValue = counter;
        Thread.yield();
        currentValue++;
        Thread.yield();
        counter = currentValue;
        System.out.println("Counter incremented, new value " + counter);
    }

    public static int getCounter() {
        return counter;
    }
}
