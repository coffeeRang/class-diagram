package com.example.classdiagram.claim.factory;

import com.example.classdiagram.claim.code.ClaimType;
import com.example.classdiagram.claim.process.AbstractClaimProcess;

public class ClaimFactory {
    public static AbstractClaimProcess create(String type) {
        return ClaimType.valueOf(type).create();
    }
}
