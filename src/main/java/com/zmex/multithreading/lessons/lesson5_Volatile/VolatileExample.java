package com.zmex.multithreading.lessons.lesson5_Volatile;

/**
 * Volatile makes variable usable for all threads. Changing this variable will be visible for all
 * threads.
 */
public class VolatileExample {

  private static final int MAX_COUNTER_VALUE = 10;

  static volatile int counter = 0;

  public static void main(String[] args) {
    new Writer().start();
    new Reader().start();
  }

  static class Writer extends Thread {

    @Override
    public void run() {
      while (counter < MAX_COUNTER_VALUE) {
        counter++;
        System.out.println(
            "Thread " + Thread.currentThread().getName() + " incremented counter to " + counter);
        try {
          Thread.sleep(600);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
      }
    }
  }

  static class Reader extends Thread {

    @Override
    public void run() {
      int localCounterValue = counter;
      while (localCounterValue < MAX_COUNTER_VALUE) {
        if (localCounterValue != counter) {
          System.out.println("Counter value = " + counter);
          localCounterValue = counter;
        }
      }
    }
  }
}
