package com.example.classdiagram.claim.beantest;

import org.springframework.beans.factory.annotation.Autowired;

public class TempService {
    @Autowired
    private TempComponent tempComponent;

    public void testService() {
        System.out.println("run testService");
        tempComponent.run();
    }

}
