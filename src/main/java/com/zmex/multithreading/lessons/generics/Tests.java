package com.zmex.multithreading.lessons.generics;

import java.util.ArrayList;
import java.util.List;

public class Tests {

    public static void main(String[] args) {
        List<? super Animal> animals = new ArrayList<>();

        Cat cat = new Cat("Cat");
        animals.add(cat);

        final Object object = animals.get(0);

        List<? extends Animal> zoo = List.of(cat);
        //zoo.add(cat);
        final Animal animal = zoo.get(0);
    }
}
