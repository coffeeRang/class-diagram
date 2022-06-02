package com.example.classdiagram.generic;

public class Cage {
    private Animal animal;

    // 동물을 넣는다.
    public void put(Animal animal) {
        this.animal = animal;
    }

    // 동물을 꺼낸다.
    public Animal get() {
        return this.animal;
    }
}
