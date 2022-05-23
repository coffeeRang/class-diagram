package com.example.classdiagram.claim.code;

public enum ClaimTask {
    CANCEL("CANCEL"),
    EXCHANGE("EXCHANGE"),
    REFUND("REFUND")
    ;

    private String taskCd;

    private ClaimTask(String taskCd) {
        this.taskCd = taskCd;
    }

}
