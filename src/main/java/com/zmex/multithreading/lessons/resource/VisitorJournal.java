package com.zmex.multithreading.lessons.resource;

public class VisitorJournal {

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
