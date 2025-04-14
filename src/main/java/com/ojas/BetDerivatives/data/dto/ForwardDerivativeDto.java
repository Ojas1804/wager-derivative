package com.ojas.BetDerivatives.data.dto;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ForwardDerivativeDto {
    private int oldSellerId;
    private int oldBuyerId;
    private int newSellerId;
    private int newBuyerId;
    private int transactionId;
}
