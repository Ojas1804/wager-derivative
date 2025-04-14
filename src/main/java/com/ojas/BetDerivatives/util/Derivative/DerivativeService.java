package com.ojas.BetDerivatives.util.Derivative;

import com.ojas.BetDerivatives.data.dto.ForwardDerivativeDto;

public class DerivativeService {
    private int betId;
    private WagerRepo

    public void forwardDerivative(Integer betId, ForwardDerivativeDto newContractDto) {
        if(newContractDto.getOldBuyerId() == newContractDto.getNewBuyerId()) {
            if(newContractDto.getOldSellerId() != newContractDto.getNewSellerId()) {

            }
        }
    }
}
