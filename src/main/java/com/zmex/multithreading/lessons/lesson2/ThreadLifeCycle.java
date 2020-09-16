package com.zmex.multithreading.lessons.lesson2;

import com.zmex.multithreading.lessons.threads.ExtendThreadExample;

/**
 *                                                <---
 *                                      waiting / blocking / sleeping
 *                                     |                             \
 *                                    |                               \
 *  new(created) --> runnable(placed | in pull) <--> running(execution \ started) --> dead
 */

public class ThreadLifeCycle {

  public static void main(String[] args) throws InterruptedException {
    ExtendThreadExample extendThreadExample = new ExtendThreadExample();
    extendThreadExample.start();
    Thread.sleep(3000);
    System.out.println("Main thread finished work");
  }

}
