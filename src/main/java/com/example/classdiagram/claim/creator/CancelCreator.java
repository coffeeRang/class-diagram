package com.example.classdiagram.claim.creator;

import com.example.classdiagram.claim.dto.OrderClaim;
import com.example.classdiagram.claim.dto.OrderCost;
import lombok.Data;

@Data
public class CancelCreator extends AbstractDataCreator {
    private OrderClaim orderClaim;
    private OrderCost orderCost;

    @Override
    public CancelCreator getCreator() {
        return null;
    }
}
