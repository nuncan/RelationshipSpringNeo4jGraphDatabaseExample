package me.nuncan.hiringmodel.entity;


import lombok.Data;
import lombok.Generated;
import org.neo4j.ogm.annotation.*;
import org.neo4j.ogm.cypher.compiler.NodeBuilder;
import org.neo4j.ogm.response.model.NodeModel;

import java.util.Collection;

@Data
@NodeEntity
@Generated
public class Job extends NodeModel {

    @Id
    @GeneratedValue
    private Long Id;

    private String name;

    private String jobTitle;


    private NodeBuilder linkedNodes;

    public Job(NodeBuilder linkedNodes) {
        this.linkedNodes = linkedNodes;
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
