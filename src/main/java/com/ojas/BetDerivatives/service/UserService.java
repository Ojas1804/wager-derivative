package com.ojas.BetDerivatives.service;


import com.ojas.BetDerivatives.model.User;
import com.ojas.BetDerivatives.data.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    @Autowired
    UserRepository userRepository;

    public Page<User> getUsersByPage(int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by("createdAt").descending());
        return userRepository.findAll(pageable);
    }

    public User getUserByUserId(Integer userId) {
        return userRepository.findById(userId).orElse(null);
    }

    public Page<User> getUserByNameContaining(String subString, int pageNumber, int pageSize) {
        Pageable pageable = PageRequest.of(pageNumber, pageSize, Sort.by("createdAt").descending());
        return userRepository.findByUserNameContainingIgnoreCase(subString, pageable);
    }

    public User getUserByUserName(String name) {
        return userRepository.findByUserName(name).orElse(null);
    }
}
