package com.example.service;

import com.example.domain.User;
import com.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@SuppressWarnings("unused")
@Service
public class UserService {
  @Autowired
  private UserRepository userRepository;

  public User getByUsername(String username) {
		return userRepository.findByUsername(username);
  }
}
