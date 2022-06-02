package com.example.classdiagram.claim.controller;

import com.example.classdiagram.claim.beantest.TempService;
import com.example.classdiagram.claim.factory.ClaimCreatorFactory;
import com.example.classdiagram.claim.factory.ClaimFactory;
import com.example.classdiagram.claim.factory.ValidationFactory;

public class CancelController {
    public static void main(String[] args) {
        TempService tempService = new TempService();
        tempService.process();

//        String claimType = "CANCEL";
//
//        ClaimFactory.create(claimType).beforeClaim();
//
//        // 취소 가능한 상태인지 체크
//        ValidationFactory.getValidator(claimType).validate();
//
//        // todo 주문 모니터링 insert 필요
//        ClaimCreatorFactory.getCreator(claimType).getCreator();
////        ClaimFactory.create(claimType).claimProcess(claimType);
//        ClaimFactory.create(claimType).afterClaim();
//
//        //todo 주문 모니터링 update 필요
//        // afterClaim에서 처리할지 말지 기준 결정 필요
    }



}
