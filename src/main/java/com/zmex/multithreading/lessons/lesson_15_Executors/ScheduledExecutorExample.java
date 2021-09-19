package com.zmex.multithreading.lessons.lesson_15_Executors;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorExample {

    public static void main(String[] args) {

        ScheduledThreadPoolExecutor executorService = new ScheduledThreadPoolExecutor(5);
        List<String> ss = new CopyOnWriteArrayList<>();
        executorService.scheduleAtFixedRate(() -> {
            System.out.println("Task completed");
        }, 0, 10, TimeUnit.SECONDS);
    }
}
