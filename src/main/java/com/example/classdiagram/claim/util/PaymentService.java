package com.example.classdiagram.claim.util;

import org.springframework.stereotype.Component;

@Component
public class PaymentService {
    /**
     * 결제 데이터 생성
     */
    public void createPaymentData() {
        System.out.println("결제 데이터 생성");
    }

    /**
     * 금액 검증
     * @return
     */
    public boolean verifyAmount() {
        return true;
    }
}
