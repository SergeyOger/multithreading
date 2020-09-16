package com.zmex.multithreading.lessons.threads;

public class ExtendThreadExample extends Thread{

  @Override
  public void run() {
    System.out.println("First thread started. Thread name " + Thread.currentThread().getName());
  }
}
