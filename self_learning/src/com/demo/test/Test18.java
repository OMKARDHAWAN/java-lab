package com.demo.test;

import java.util.ArrayList;
import java.util.List;

import com.demo.model.Animal;
import com.demo.model.Dog;



public class Test18 {

    // ? extends Animal (Upper Bounded Wildcard)
    public static void displayAnimals(List<? extends Animal> list) {
        System.out.println("\nUsing ? extends Animal");
        for (Animal a : list) {
            a.sound();
        }
    }

    // ? super Dog (Lower Bounded Wildcard)
    public static void addDog(List<? super Dog> list) {
        System.out.println("\nUsing ? super Dog");
        list.add(new Dog());
        System.out.println("Dog object added successfully.");
    }

    // ? (Unbounded Wildcard)
    public static void displayList(List<?> list) {
        System.out.println("\nUsing ?");
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {

        // List of Dog
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());

        // List of Animal
        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal());

        // ? extends
        displayAnimals(dogList);

        // ? super
        addDog(animalList);

        // ? (Unbounded)
        List<String> names = new ArrayList<>();
        names.add("Amit");
        names.add("Rahul");
        names.add("Neha");

        displayList(names);
    }
}

