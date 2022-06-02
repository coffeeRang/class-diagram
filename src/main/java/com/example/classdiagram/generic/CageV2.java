package com.example.classdiagram.generic;

public class CageV2<T extends Animal> {
    private T animal;

    public void put(T animal) {
        this.animal = animal;
    }

    public T get() {
        return this.animal;
    }
}
