package me.nuncan.hiringmodel.entity;

import lombok.Data;
import org.neo4j.driver.internal.value.DateTimeValue;
import org.neo4j.ogm.annotation.*;
import org.neo4j.ogm.annotation.typeconversion.DateLong;

import java.util.Collection;

@Data
@RelationshipEntity(type = "Related")
public class Roles extends User {

    @Id
    @GeneratedValue
    private Long Id;

    @DateLong
    private DateTimeValue dateTimeValue;

    private Collection<String> rolesCollection;

    @StartNode
    private User user;

    @EndNode
    private Friend friend;

    public Roles() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public DateTimeValue getDateTimeValue() {
        return dateTimeValue;
    }

    public void setDateTimeValue(DateTimeValue dateTimeValue) {
        this.dateTimeValue = dateTimeValue;
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