package com.example.classdiagram.generic;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestGeneric {

    /**
     * 우리에 넣는 시점에는 객체의 타입을 알 수 있으나, 꺼내는 시점에는 그 객체가 어떤 동물인지 알 수 없다.
     */
    @Test
    void testTypeSafe() {
        Lion leo = new Lion();
        Cage cage = new Cage();
        cage.put(leo);

        Duck donald = (Duck) cage.get();   // ClassCastException
        donald.ggack();;
    }

    /**
     * 타입을 분별하는 로직이 추가되었습니다.
     */
    @Test
    void testTypeSafe2() {
        Lion leo = new Lion();
        Cage cage = new Cage();
        cage.put(leo);

        Animal whatAnimal = cage.get();

        if (whatAnimal instanceof Duck) {
            Duck donald = (Duck) whatAnimal;
            donald.ggack();
        } else {
            System.out.println("오리가 아니에요!!");
        }
    }

    /**
     * 제네릭이 적용된 우리에서는 객체를 꺼낼때도 타입을 체크합니다.
     */
    @Test
    void testTypeSafe3() {
        Lion leo = new Lion();
//        CageUseGeneric<Lion> cage = new CageUseGeneric();
//        cage.put(leo);

        CageUseGeneric<Person> cage = new CageUseGeneric<>();
        Person p = new Person();
        cage.put(p);

//        Duck donald = cage.get();

    }

    /**
     * 사람을 우리에 담으면 안됩니다..
     */
    @Test
    void testTypeSafe4() {
        Lion leo = new Lion();
//        CageV2<Lion> cage = new CageV2<>();
//        cage.put(leo);

        Person p = new Person();
        CageV2<Person> cage = new CageV2<Person>();
    }

}
