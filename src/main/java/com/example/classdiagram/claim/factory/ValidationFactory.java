package com.example.classdiagram.claim.factory;

import com.example.classdiagram.claim.code.ClaimType;
import com.example.classdiagram.claim.validate.AbstractClaimValidator;

public class ValidationFactory {
    public static AbstractClaimValidator getValidator(String type) {
        return ClaimType.valueOf(type).validator();
    }

}
