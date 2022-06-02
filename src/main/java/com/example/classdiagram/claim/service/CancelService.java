package com.example.classdiagram.claim.service;

import org.springframework.stereotype.Service;

@Service
public class CancelService {

    public void doCancel() {
        System.out.println("취소처리 완료");
    }

    public void updateCancelData() {
        System.out.println("취소데이터 업데이트");
    }

    public void sendMms() {
        System.out.println("취소 문자 발송");
    }

}
