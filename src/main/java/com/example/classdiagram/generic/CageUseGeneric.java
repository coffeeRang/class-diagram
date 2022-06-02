package com.example.classdiagram.generic;

/**
 * 특정 타입에 정의해서 cage에 담을 수 있습니다.
 * @param <T>
 */
public class CageUseGeneric<T> {
    private T animal;

    public void put(T animal) {
        this.animal = animal;
    }

    public T get() {
        return this.animal;
    }
}
