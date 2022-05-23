package com.example.classdiagram.claim.common;

import org.springframework.stereotype.Component;

@Component
public class MonitorService {

    public void insertMonitoring() {
        System.out.println("모니터링 insert 성공");
    }

    public void updateMonitoring() {
        System.out.println("모니터링 update 성공");
    }

}
