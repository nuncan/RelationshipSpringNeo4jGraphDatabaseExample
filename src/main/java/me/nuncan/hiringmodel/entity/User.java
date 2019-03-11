package me.nuncan.hiringmodel.entity;

import lombok.Data;
import lombok.Generated;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.Contract;
import org.neo4j.ogm.annotation.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

@RelationshipEntity
public class User {

    @Id
    Long Id;

    @Relationship(value = "User")
    User user;

    @Relationship(value = "Name")
    String name;

    @Relationship(value = "Role")
    Roles roles;

    @Relationship(value = "Users")
    List<User> userList;

    @Relationship(value = "RolesList")
    List<Roles> User_Roles;

    @Relationship(value = "Friendships")
    LinkedHashMap<Friend, User> friends;

    @Relationship(value = "Friend")
    Friend friend;

    @Contract(pure = true)

    public User(String name) {
        this.name = name;
    }

    public void addFriend(Friend arg) {
        this.friend = arg;
        this.friends = new LinkedHashMap<>();
    }
}
