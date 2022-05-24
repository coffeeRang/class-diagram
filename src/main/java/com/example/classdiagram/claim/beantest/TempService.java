package com.example.classdiagram.claim.beantest;

import com.example.classdiagram.util.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class TempService {
//    @Autowired
//    private TempComponent tempComponent;

    private TempComponent tempComponent;

    public TempService() {
        tempComponent =
                (TempComponent) BeanUtils.getBean("tempComponent");
    }

    public void process() {
        System.out.println("run testService");
        tempComponent.run();
    }

}
