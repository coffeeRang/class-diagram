package com.example.classdiagram.claim.beantest;

import com.example.classdiagram.util.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class TempService {
    @Autowired
//    private TempComponent tempComponent;

    private TempComponent tempComponent;
//
//    public TempService() {
//        tempComponent =
//                (TempComponent) BeanUtils.getBean("tempComponent");
//    }

    public void process() {
        System.out.println("run testService");
        tempComponent = (TempComponent) BeanUtils.getBean("tempComponent");
        System.out.println(">> " + tempComponent);

        TempComponent t1 = (TempComponent) BeanUtils.getBean("tempComponent");
        System.out.println(">>> " + t1);
//        TempComponent t3 = (TempComponent) BeanUtils.getBean("tempComponent2");
//        System.out.println(">>> " + t3);
        tempComponent.run();


    }



}
