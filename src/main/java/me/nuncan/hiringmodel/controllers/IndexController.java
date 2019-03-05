package me.nuncan.hiringmodel.controllers;

import me.nuncan.hiringmodel.entity.User;
import me.nuncan.hiringmodel.service.UserService;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RepositoryRestResource
public class IndexController {

    @Resource
    UserService userService;

    @GetMapping
    public String getIndex() {
        return "index";
    }

    @GetMapping
    public String createUser(@PathVariable String name) {
        return userService.save(new User(name)).toString();
    }

}
