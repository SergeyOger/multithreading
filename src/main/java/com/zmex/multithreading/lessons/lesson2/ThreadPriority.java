package com.zmex.multithreading.lessons.lesson2;

import com.zmex.multithreading.lessons.threads.ExtendThreadExample;

/**
 * Thread priority doesn't dive any warranties about priority because of operating system, but
 * calling this method will recommend scheduler rearrange threads priority.
 * <p>
 * yield() - returns current thread to the thread pull(state runnable), but without warranties that
 * it won't be immediately moved into running state.
 * <p>
 * join() -
 */

public class ThreadPriority {

  public static void main(String[] args) throws InterruptedException {
    Thread thread1 = new ExtendThreadExample();
    thread1.setName("First thread");
    thread1.setPriority(Thread.MIN_PRIORITY);
    thread1.start();
    thread1.join();

    Thread thread2 = new ExtendThreadExample();
    thread2.setName("Second thread");
    thread2.start();

    Thread thread3 = new ExtendThreadExample();
    thread3.setName("Third thread");
    thread3.setPriority(Thread.MAX_PRIORITY);
    thread3.start();

    System.out.println("Main thread finished work");
  }

}
