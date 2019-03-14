package me.nuncan.hiringmodel.entity;


import lombok.Data;
import lombok.Generated;
import org.neo4j.driver.internal.value.DateTimeValue;
import org.neo4j.ogm.annotation.*;
import org.neo4j.ogm.annotation.typeconversion.DateLong;

import java.util.Collection;

@Data
@NodeEntity
@Generated
public class Friend extends User{

    @Id
    @GeneratedValue
    private Long Id;

    @DateLong
    private DateTimeValue dateTimeValue;

    @Transient
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

    public DateTimeValue getDateTimeValue() {
        return dateTimeValue;
    }

    public void setDateTimeValue(DateTimeValue dateTimeValue) {
        this.dateTimeValue = dateTimeValue;
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
