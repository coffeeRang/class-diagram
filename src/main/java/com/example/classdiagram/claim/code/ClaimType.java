package com.example.classdiagram.claim.code;

import com.example.classdiagram.claim.creator.AbstractDataCreator;
import com.example.classdiagram.claim.creator.CancelCreator;
import com.example.classdiagram.claim.process.CancelProcess;
import com.example.classdiagram.claim.process.AbstractClaimProcess;
import com.example.classdiagram.claim.process.RefundProcess;
import com.example.classdiagram.claim.process.ExchangeProcess;
import com.example.classdiagram.claim.validate.AbstractClaimValidator;
import com.example.classdiagram.claim.validate.CancelValidator;

public enum ClaimType {
    CANCEL("CANCEL"){
        @Override
        public AbstractClaimProcess create() {
            return new CancelProcess();
        }
        @Override
        public AbstractDataCreator data() {
            return new CancelCreator();
        }

        @Override
        public AbstractClaimValidator validator() {
            return new CancelValidator();
        }
    };

    private String type;

    ClaimType(String type) {
        this.type = type;
    }

    public abstract AbstractClaimProcess create();
    public abstract AbstractDataCreator data();
    public abstract AbstractClaimValidator validator();



}
