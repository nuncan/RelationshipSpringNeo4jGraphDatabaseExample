package me.nuncan.hiringmodel.controllers;

import lombok.extern.slf4j.Slf4j;
import me.nuncan.hiringmodel.datasources.Neo4j.repository.UserRepoNeo4j;
import me.nuncan.hiringmodel.entity.Friend;
import me.nuncan.hiringmodel.entity.Roles;
import me.nuncan.hiringmodel.entity.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import java.util.Stack;

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

        Friend friendChris = new Friend();
        Friend friendJohn = new Friend();


        Roles family = new Roles();
        Roles brother = new Roles();
        Roles engineer = new Roles();


        userNick.setName("Nick");
        userNick.setJobTitle("Software Engineer");
        userRepoNeo4j.save(userNick);


        friendChris.setName("Chris");
        friendChris.setJobTitle("Delivery Driver");
        userRepoNeo4j.save(friendChris);

        friendJohn.setName("John");
        friendJohn.setJobTitle("Robotics Engineer");
        userRepoNeo4j.save(friendJohn);


        family.setUser(userNick);
        family.setFriend(friendChris);


        brother.setFriend(friendChris);
        brother.setUser(userNick);


        engineer.setUser(userNick);
        engineer.setFriend(friendJohn);


        Stack<Roles> rolesColl = new Stack<>();
        rolesColl.push(family);
        rolesColl.push(engineer);
        rolesColl.push(brother);

        userRepoNeo4j.save(engineer);
        userRepoNeo4j.save(family);
        userRepoNeo4j.save(brother);



        return userRepoNeo4j.toString();
    }

}
