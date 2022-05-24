package com.example.classdiagram.claim;

import com.example.classdiagram.claim.beantest.TempService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestCancelProcess {

    @Test
    void testCancel() {
        String type = "CANCEL";
        System.out.println("run test");
    }

    @Test
    void testServiceRun() {
        TempService tempService = new TempService();
        tempService.testService();

    }
}
