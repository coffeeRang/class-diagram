package com.example.classdiagram.claim.factory;

import com.example.classdiagram.claim.code.ClaimType;
import com.example.classdiagram.claim.creator.AbstractDataCreator;

public class ClaimCreatorFactory {
    public static AbstractDataCreator getCreator(String type) {
        System.out.println(type + " 객체 생성");
        return ClaimType.valueOf(type).data();
    }
}
