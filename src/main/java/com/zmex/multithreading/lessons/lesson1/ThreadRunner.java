package com.zmex.multithreading.lessons.lesson1;

import com.zmex.multithreading.lessons.threads.ExtendThreadExample;
import com.zmex.multithreading.lessons.threads.SecondThread;

/**
 * Notes:
 *    Thread pull doesn't give any warranties about thread starting order.
 *    Recalling method start() after finishing thread work will produce IllegalThreadsStateException
 *
 * Two main way to create new thread.
 * 1. Extend Thread
 * 2. Implement Runnable and pass as constructor parameter to Thread
 */

public class ThreadRunner {

  public static void main(String[] args) {
    Thread firstThread = new ExtendThreadExample();
    firstThread.start();

    SecondThread secondThread = new SecondThread();
    Thread secondThreadRunner = new Thread(secondThread);
    secondThreadRunner.start();
  }

}
