package com.zmex.multithreading.lessons.lesson3_Synchronization;

import com.zmex.multithreading.lessons.threads.SynchronizationUnit;

/**
 * Synchronized methods based on locks
 */

public class App {

  public static void main(String[] args) throws InterruptedException {

    Resource resource = new Resource();

    SynchronizationUnit synchronizationUnit1 = new SynchronizationUnit();
    SynchronizationUnit synchronizationUnit2 = new SynchronizationUnit();
    SynchronizationUnit synchronizationUnit3 = new SynchronizationUnit();

    synchronizationUnit1.setResource(resource);
    synchronizationUnit2.setResource(resource);
    synchronizationUnit3.setResource(resource);

    synchronizationUnit1.start();
    synchronizationUnit2.start();
    synchronizationUnit3.start();

    synchronizationUnit1.join();
    synchronizationUnit2.join();
    synchronizationUnit3.join();

    System.out.println("Total visitor counter " + resource.getVisitorCounter());
  }
}
