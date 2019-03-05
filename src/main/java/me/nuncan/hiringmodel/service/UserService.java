package me.nuncan.hiringmodel.service;

import me.nuncan.hiringmodel.entity.User;
import me.nuncan.hiringmodel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.Generated;

@Service
public class UserService  {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) {
        return userRepository.save(user);
    }
}