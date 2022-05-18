package com.example.classdiagram.claim.process;

public class RefundProcess extends AbstractClaimProcess{
    @Override
    public void claimProcess(String type) {
        System.out.println("환불 프로세스 실행");
    }

    @Override
    public void completeProcess() {
        System.out.println("환불 완료 프로세스 실행");
    }
}
