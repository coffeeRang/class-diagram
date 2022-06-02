package com.example.classdiagram.claim.code;

public enum ClaimTask {
    CANCEL("CANCEL", "01"),
    EXCHANGE("EXCHANGE", "01"),
    REFUND("REFUND", "01")
    ;

    private String taskCd;
    private String statusCd;

    private ClaimTask(String taskCd, String statusCd) {
        this.taskCd = taskCd;
        this.statusCd = statusCd;
    }

}
