package com.zmex.multithreading.lessons.generics;

import java.util.UUID;

public class Animal {

    private final UUID id = UUID.randomUUID();

    public UUID getId() {
        return id;
    }
}
