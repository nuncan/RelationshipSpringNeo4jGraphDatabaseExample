package me.nuncan.hiringmodel.entity;


import lombok.Data;
import lombok.Generated;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Collection;

@Data
@NodeEntity
@Generated
public class Friend extends User{

    @Id
    @GeneratedValue
    private Long Id;

    private String name;

    private String jobTitle;

    @Relationship(type = "Related")
    private Collection<User> ConnectedUsers;

    public Friend() {
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
