package com.zmex.multithreading.lessons.lesson6_Atomic_variables;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicVariablesExample {

  static AtomicInteger counter = new AtomicInteger(0);

  public static void main(String[] args) throws InterruptedException {

    for (int i = 0; i < 10_000; i++) {
      new CounterIncrementer().start();
    }

    Thread.sleep(2000);
    System.out.println(counter);
  }

  static class CounterIncrementer extends Thread {

    @Override
    public void run() {
      Thread.yield();
      counter.getAndIncrement();
    }
  }
}
