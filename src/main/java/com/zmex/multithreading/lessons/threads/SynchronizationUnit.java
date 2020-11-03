package com.zmex.multithreading.lessons.threads;

import com.zmex.multithreading.lessons.lesson3_Synchronization.Resource;

public class SynchronizationUnit extends Thread {

  private Resource resource;

  public void setResource(Resource resource) {
    this.resource = resource;
  }

  @Override
  public void run() {
    System.out.println("Thread " + Thread.currentThread().getName() + " started");
    System.out.println("Thread " + Thread.currentThread().getName() + " visitor counter " + resource.getVisitorCounter());
    Thread.yield();
    resource.increaseVisitorCounter();
    System.out.println("Thread " + Thread.currentThread().getName() + " current visitor counter " + resource.getVisitorCounter());
  }
}
