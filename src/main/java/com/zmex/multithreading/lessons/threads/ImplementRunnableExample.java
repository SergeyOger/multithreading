package com.zmex.multithreading.lessons.threads;

public class ImplementRunnableExample implements Runnable{

  @Override
  public void run() {
    System.out.println("Thread started. Thread name " + Thread.currentThread().getName());
  }
}
