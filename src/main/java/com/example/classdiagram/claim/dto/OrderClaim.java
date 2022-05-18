package com.example.classdiagram.claim.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderClaim {
    private String odNo;
    private long pdSeq;
    private long prcSeq;
    private String pdNo;
    private String optNo;
    private String odClmTypCd;
    private String spFrqClCd;
    private long odQty;
    private long cancelQty;
    private long deliveryNo;
    private String odStCd;
    private String clmNo;
    private String prePrcSeq;
    private LocalDateTime clmAcceptDttm;
    private LocalDateTime clmCompleteDttm;
}
