package com.ojas.BetDerivatives.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "Wallet")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Wallet {

    @Id
    @Column(name = "WALLET_ID")
    private Integer walletId;

    @Column(name = "WALLET_AMOUNT", precision = 10, scale = 2)
    private BigDecimal walletAmount;

    @OneToMany(mappedBy = "wallet", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<User> users;
}