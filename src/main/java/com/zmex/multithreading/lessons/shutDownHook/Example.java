package com.zmex.multithreading.lessons.shutDownHook;

public class Example {

  public static void main(String[] args) {
    Runtime.getRuntime().addShutdownHook(new Hook());
  }

  static class Hook extends Thread {

    @Override
    public void run() {
      System.out.println("Hook executed");
    }
  }
}

