package com.zmex.multithreading.lessons.lesson_15_Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Example {

  public static void main(String[] args) {
    ExecutorService executor = Executors.newSingleThreadExecutor();
    executor.execute(new ExecutorExample());
    executor.shutdown();
  }

  static class ExecutorExample extends Thread {

    @Override
    public void run() {
      System.out.println("Thread " + Thread.currentThread().getName() + " started to work");
    }
  }
}
