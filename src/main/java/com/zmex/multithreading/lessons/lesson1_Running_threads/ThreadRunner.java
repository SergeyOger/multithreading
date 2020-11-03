package com.zmex.multithreading.lessons.lesson1_Running_threads;

import com.zmex.multithreading.lessons.threads.ExtendThreadExample;
import com.zmex.multithreading.lessons.threads.ImplementRunnableExample;

/**
 * Notes: Thread pull doesn't give any warranties about thread starting order. Recalling method
 * start() after finishing thread work will produce IllegalThreadsStateException
 * <p>
 * Two main way to create new thread. 1. Extend Thread 2. Implement Runnable and pass as constructor
 * parameter to Thread
 */

public class ThreadRunner {

  public static void main(String[] args) {
    Thread firstThread = new ExtendThreadExample();
    firstThread.start();

    ImplementRunnableExample implementRunnableExample = new ImplementRunnableExample();
    Thread secondThreadRunner = new Thread(implementRunnableExample);
    secondThreadRunner.start();
  }
}
