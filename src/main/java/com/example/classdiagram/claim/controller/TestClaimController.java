package com.example.classdiagram.claim.controller;

import com.example.classdiagram.claim.code.ClaimType;
import com.example.classdiagram.claim.factory.ClaimCreatorFactory;
import com.example.classdiagram.claim.factory.ClaimFactory;
import com.example.classdiagram.claim.factory.ValidationFactory;

public class TestClaimController {
    public static void main(String[] args) {
        String claimType = "CANCEL";

        ClaimFactory.create(claimType).beforeClaim();
        ValidationFactory.getValidator(claimType).validate();
        ClaimCreatorFactory.getCreator(claimType).getCreator();
//        ClaimFactory.create(claimType).claimProcess(claimType);
        ClaimFactory.create(claimType).afterClaim();
    }

}
