package com.example.classdiagram.claim.validate;

public class CancelValidator extends AbstractClaimValidator {
    @Override
    public void validate() {
        System.out.println("취소 validation 실행");
        System.out.println("취소 validation 결과: 정상");

    }
}
