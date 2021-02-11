package com.zmex.multithreading.lessons.lesson_14_Callable_Feature;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Example {

  public static void main(String[] args) throws ExecutionException, InterruptedException {
    Callable<Integer> example = new CallableExample();
    final FutureTask<Integer> futureTask = new FutureTask<>(example);
    final Thread thread = new Thread(futureTask);
    thread.start();
    System.out.println(futureTask.get());
  }

  static class CallableExample implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
      Thread.sleep(300);
      return 10;
    }
  }
}
