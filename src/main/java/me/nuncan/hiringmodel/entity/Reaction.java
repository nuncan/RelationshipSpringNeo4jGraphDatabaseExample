package me.nuncan.hiringmodel.entity;

import lombok.Generated;
import org.neo4j.driver.internal.value.DateTimeValue;
import org.neo4j.ogm.annotation.*;
import org.neo4j.ogm.annotation.typeconversion.DateLong;

@Generated
@RelationshipEntity(type = "Reaction")
public class Reaction {

    @Id
    @GeneratedValue
    private long Id;

    @DateLong
    private DateTimeValue dateTimeValue;

    private String company;

    private String jobTitle;

    private String reactionType;

    private Action initialAction;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getReactionType() {
        return reactionType;
    }

    public void setReactionType(String reactionType) {
        this.reactionType = reactionType;
    }

    public Action getInitialAction() {
        return initialAction;
    }

    public void setInitialAction(Action initialAction) {
        this.initialAction = initialAction;
    }

    public Reaction(long id, String company, String jobTitle, String reactionType, Action initialAction) {
        Id = id;
        this.company = company;
        this.jobTitle = jobTitle;
        this.reactionType = reactionType;
        this.initialAction = initialAction;
    }
}
