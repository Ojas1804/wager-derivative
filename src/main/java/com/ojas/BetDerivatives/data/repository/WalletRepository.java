package com.ojas.BetDerivatives.data.repository;

import com.ojas.BetDerivatives.model.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WalletRepository extends JpaRepository<Wallet, Integer> {
}