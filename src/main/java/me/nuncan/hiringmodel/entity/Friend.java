package me.nuncan.hiringmodel.entity;


import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Generated;
import org.neo4j.ogm.annotation.*;

import java.util.Collection;
import java.util.Objects;

@Data
@NodeEntity
@Generated
public class Friend extends User{

    @Id
    @GeneratedValue
    private Long Id;

    @Transient
    private String name;

    private String jobTitle;

    @Relationship(type = "Related")
    private Collection<User> ConnectedUsers;

    public Friend() {
    }

    public Friend(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public Friend(Long id, String name, String jobTitle, Collection<User> connectedUsers) {
        Id = id;
        this.name = name;
        this.jobTitle = jobTitle;
        ConnectedUsers = connectedUsers;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Collection<User> getConnectedUsers() {
        return ConnectedUsers;
    }

    public void setConnectedUsers(Collection<User> connectedUsers) {
        ConnectedUsers = connectedUsers;
    }

}
