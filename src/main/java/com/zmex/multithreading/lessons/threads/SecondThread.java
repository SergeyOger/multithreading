package com.zmex.multithreading.lessons.threads;

public class SecondThread implements Runnable{

  @Override
  public void run() {
    System.out.println("Second thread started. Thread name " + Thread.currentThread().getName());
  }
}
