package me.nuncan.hiringmodel.entity;

import lombok.Data;
import lombok.Generated;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import org.jetbrains.annotations.Contract;
import org.neo4j.ogm.annotation.*;

import java.util.List;

@RelationshipEntity
public class Roles {

    @Id
    Long Id;

    @Relationship(value = "Name")
    String Name;

    @Relationship(value = "Role")
    Roles roles;

    @Relationship(value = "User")
    User user;

    @Relationship(value = "Friend")
    Friend friend;

    @Relationship(value = "Friendships")
    List<Friend> friends;

    @Relationship(value = "RolesList")
    List<Roles> User_Roles;

    @Relationship(value = "Users")
    List<User> userList;

    public Roles(String name) {
        this.Name = name;
    }
}