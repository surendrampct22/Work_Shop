package com.order.service;

import com.order.entity.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Optional;

public interface UserService {

    User register(User user);

    String login(String username, String password);

    Optional<User> findByUsername(String username);


}
