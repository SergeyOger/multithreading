package com.zmex.multithreading.lessons.resource;

public class HotelReceptionist extends Thread {

  private VisitorJournal visitorJournal;

  public void setVisitorJournal(VisitorJournal visitorJournal) {
    this.visitorJournal = visitorJournal;
  }

  @Override
  public void run() {
    System.out.println("Thread " + Thread.currentThread().getName() + " started");
    System.out.println("Thread " + Thread.currentThread().getName() + " visitor counter " + visitorJournal
        .getVisitorCounter());
    Thread.yield();
    visitorJournal.increaseVisitorCounter();
    System.out.println("Thread " + Thread.currentThread().getName() + " current visitor counter " + visitorJournal
        .getVisitorCounter());
  }
}
