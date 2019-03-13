package me.nuncan.hiringmodel.entity;

import lombok.Data;
import lombok.Generated;
import org.neo4j.ogm.annotation.*;

import java.util.Collection;
import java.util.Objects;

@Data
@Generated
@RelationshipEntity(type = "Related")
public class Roles extends User {

    @Id
    @GeneratedValue
    private Long Id;

    private Collection<String> rolesCollection;

    @StartNode
    private User user;

    @EndNode
    private Friend friend;

    private Ser<>

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public Collection<String> getRolesCollection() {
        return rolesCollection;
    }

    public void setRolesCollection(Collection<String> rolesCollection) {
        this.rolesCollection = rolesCollection;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Friend getFriend() {
        return friend;
    }

    public void setFriend(Friend friend) {
        this.friend = friend;
    }
}