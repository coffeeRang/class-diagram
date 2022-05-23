package com.example.classdiagram.claim.process;

import com.example.classdiagram.claim.common.MonitorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
public abstract class AbstractClaimProcess {

    public abstract void claimProcess(String type);
    public abstract void completeProcess();
    public void beforeClaim() {
        System.out.println("클레임 처리 시작 전 실행");
    }
    public void afterClaim() {
        System.out.println("클레임 처리 완료 후 실행");
    }

}
