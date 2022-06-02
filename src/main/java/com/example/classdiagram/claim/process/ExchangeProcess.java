package com.example.classdiagram.claim.process;

public class ExchangeProcess extends AbstractClaimProcess {
    @Override
    public void claimProcess(String odNo, long pdSn, long prcSn) {
        System.out.println("run 교환 프로세스 ");
    }

    @Override
    public void completeProcess() {
        System.out.println("run 교환완료 프로세스");
    }
}
