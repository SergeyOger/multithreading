package com.zmex.multithreading.lessons.lesson_16_ScheduledExecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Example {

  public static void main(String[] args) {
    ScheduledExecutorService scheduledExecutorService = Executors
        .newSingleThreadScheduledExecutor();
    scheduledExecutorService.schedule(new ScheduledWorker(), 5, TimeUnit.SECONDS);
  }

  static class ScheduledWorker extends Thread {

    @Override
    public void run() {
      System.out.println("New thread successfully started");
    }
  }
}
