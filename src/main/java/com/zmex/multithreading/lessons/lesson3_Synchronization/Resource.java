package com.zmex.multithreading.lessons.lesson3_Synchronization;

public class Resource {

  private int visitorCounter;

  public int getVisitorCounter() {
    return visitorCounter;
  }

  public void increaseVisitorCounter() {
    int visitorCounter = this.visitorCounter;
    visitorCounter++;
    this.visitorCounter = visitorCounter;
  }
}
