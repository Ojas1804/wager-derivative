package com.ojas.BetDerivatives.data.repository;

import com.ojas.BetDerivatives.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    Page<User> findAll(Pageable pageable);

    Page<User> findByUserNameContainingIgnoreCase(String userName, Pageable pageable);

    Optional<User> findByUserName(String userName);
}
