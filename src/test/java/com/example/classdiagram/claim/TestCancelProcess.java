package com.example.classdiagram.claim;

import com.example.classdiagram.claim.beantest.TempService;
import com.example.classdiagram.claim.factory.ClaimFactory;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TestCancelProcess {

    @Test
    void testByUseClaimType() {
        String claimType = "CANCEL";
        String odNo = "T0001";
        long pdSn = 1;
        long prcSn = 1;
        ClaimFactory.create(claimType).beforeClaim();
        ClaimFactory.create(claimType).claimProcess(odNo, pdSn, prcSn);

    }

    @Test
    void testServiceRun() {
        TempService tempService = new TempService();
        tempService.process();

    }

    @Test
    void wordProcessTest() {
        List<String> words = Arrays.asList("TONY", "a", "hULK", "B", "america", "X", "nebula", "Korea");
        String result =words.stream()
                .filter(w -> w.length() > 1)
                .map(String::toUpperCase)
                .map(w -> w.substring(0, 1))
                .collect(Collectors.joining(" "));

        assertThat(result).isEqualTo("T H A N K");
    }

}
