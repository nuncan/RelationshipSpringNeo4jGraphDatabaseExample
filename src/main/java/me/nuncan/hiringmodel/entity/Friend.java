package me.nuncan.hiringmodel.entity;


import lombok.RequiredArgsConstructor;
import org.neo4j.ogm.annotation.*;

import java.util.LinkedHashMap;
import java.util.List;

@RelationshipEntity
public class Friend {

    @Id
    Long Id;

    @Relationship(value = "RolesList")
    List<Roles> rolesList;

    @Relationship(value = "Name")
    String name;

    @Relationship(value = "Friendships")
    List<Friend> friends;

    @Relationship(value = "Friend")
    Friend friend;

    @Relationship(value = "User")
    User user;


    @Relationship(value = "Users")
    LinkedHashMap<User, Friend> userList;

    @Relationship(value = "Role")
    Roles roles;

    public Friend(String name) {
        this.name = name;
    }

    public void addFriend(User arg) {
        this.user = arg;
        this.userList = new LinkedHashMap<>();
    }

    public void setName(String name) {
        this.name = name;
    }
}
