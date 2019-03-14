//package me.nuncan.hiringmodel.entity;
//
//import lombok.Generated;
//import org.neo4j.driver.internal.value.DateTimeValue;
//import org.neo4j.ogm.annotation.GeneratedValue;
//import org.neo4j.ogm.annotation.Id;
//import org.neo4j.ogm.annotation.RelationshipEntity;
//import org.neo4j.ogm.annotation.typeconversion.DateLong;
//
//@Generated
//@RelationshipEntity(type = "Action")
//public class Action {
//
//    @Id
//    @GeneratedValue
//    private long Id;
//
//    @DateLong
//    private DateTimeValue dateTimeValue;
//
//    private String company;
//
//    private String jobTitle;
//
//    private String reactionType;
//
//    private Action initialAction;
//
//    public Action() {
//    }
//
//    public Action(long id, org.neo4j.driver.internal.value.DateTimeValue dateTimeValue,
//                  String company, String jobTitle, String reactionType, Action initialAction) {
//        this.Id = id;
//        this.dateTimeValue = dateTimeValue;
//        this.company = company;
//        this.jobTitle = jobTitle;
//        this.reactionType = reactionType;
//        this.initialAction = initialAction;
//    }
//
//    public long getId() {
//        return Id;
//    }
//
//    public DateTimeValue getDateTimeValue() {
//        return dateTimeValue;
//    }
//
//    public String getCompany() {
//        return company;
//    }
//
//    public String getJobTitle() {
//        return jobTitle;
//    }
//
//    public String getReactionType() {
//        return reactionType;
//    }
//
//    public Action getInitialAction() {
//        return initialAction;
//    }
//}
