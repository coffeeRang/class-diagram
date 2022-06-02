package com.example.classdiagram.claim.process;

import com.example.classdiagram.claim.service.CancelService;
import com.example.classdiagram.util.BeanUtils;
import org.springframework.stereotype.Component;

//@Component
public class CancelProcess extends AbstractClaimProcess {

    private CancelService cancelService;

    public CancelProcess() {
        cancelService = (CancelService) BeanUtils.getBean("cancelService");
    }


    @Override
    public void claimProcess(String odNo, long pdSn, long prcSn) {
        System.out.println("취소 프로세스 실행");
        cancelService.doCancel();
    }

    @Override
    public void completeProcess() {
        System.out.println("취소 프로세스 실행");
    }
}
