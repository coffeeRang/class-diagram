package com.example.classdiagram.claim.process;

import com.example.classdiagram.claim.creator.CancelCreator;
import com.example.classdiagram.claim.factory.ClaimCreatorFactory;
import com.example.classdiagram.claim.util.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class CancelProcess extends AbstractClaimProcess {


    @Override
    public void claimProcess(String claimType) {
        System.out.println("취소 프로세스 실행");
    }

    @Override
    public void completeProcess() {
        System.out.println("취소 프로세스 실행");
    }
}
