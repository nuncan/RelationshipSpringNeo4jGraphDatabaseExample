package me.nuncan.hiringmodel.datasources.Neo4j.implementation;

import lombok.Generated;
import lombok.extern.slf4j.Slf4j;
import me.nuncan.hiringmodel.datasources.Neo4j.UserService;
import me.nuncan.hiringmodel.datasources.Neo4j.repository.UserRepository;
import me.nuncan.hiringmodel.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@Generated
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public User findAllByName(String name) throws RuntimeException {
        return userRepository.findAllByName(name);
    }
}
