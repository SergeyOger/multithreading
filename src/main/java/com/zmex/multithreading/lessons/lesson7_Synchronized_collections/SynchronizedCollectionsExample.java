package com.zmex.multithreading.lessons.lesson7_Synchronized_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SynchronizedCollectionsExample {

    public static void main(String[] args) {
        NameBook nameBook = new NameBook();
        nameBook.add("First record");

        new NameReader(nameBook).start();
        new NameReader(nameBook).start();

    }
}

class NameBook {

    private List<String> names = Collections.synchronizedList(new ArrayList<>());

    public void add(String name) {
        names.add(name);
    }

    /*
    Interruption thread between checking list size and method execution may produce index out of bound exception.
     */
    public String removeFirst() {

        if (names.size() > 0) {
            Thread.yield();
            return names.remove(0);
        }

        return null;
    }
}

class NameReader extends Thread {

    private NameBook names;

    public NameReader(NameBook names) {
        this.names = names;
    }

    @Override
    public void run() {
        System.out.println(
                "Thread " + Thread.currentThread().getName() + " removed element: " + names.removeFirst());
    }
}
