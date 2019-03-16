package me.nuncan.hiringmodel.controllers;

import me.nuncan.hiringmodel.datasources.Neo4j.repository.UserRepoNeo4j;
import me.nuncan.hiringmodel.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@RequestMapping("/test")
public class IndexController {

    @Autowired
    UserRepoNeo4j userRepoNeo4j;

    @PostMapping
    public String postIndex() {
        userRepoNeo4j.deleteAll();
        return "test";
    }

    @GetMapping
    public String getIndex() {
        User userNick = new User();
        return userRepoNeo4j.toString();
    }

}
