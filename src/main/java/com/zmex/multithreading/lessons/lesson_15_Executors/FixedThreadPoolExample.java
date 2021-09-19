package com.zmex.multithreading.lessons.lesson_15_Executors;

import com.zmex.multithreading.lessons.lesson_15_Executors.model.Photo;
import com.zmex.multithreading.lessons.lesson_15_Executors.photo.PhotoRepository;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FixedThreadPoolExample {

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executor = Executors.newFixedThreadPool(2);

        Future<List<Photo>> future = executor.submit(() -> {
            PhotoRepository photoRepository = new PhotoRepository();
            return photoRepository.findAll();
        });

        System.out.println(future.get());

        executor.shutdown();
    }
}
