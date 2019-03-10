package me.nuncan.hiringmodel.datasources.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import org.neo4j.ogm.annotation.*;

import java.util.List;

@Data
@Generated
@NodeEntity
@AllArgsConstructor
public class Friend {

	@Id
	@GeneratedValue
	Long Id;

	@Property
	String name;

	@Relationship(value = "Friendships_Incoming", direction = Relationship.INCOMING)
	List<Friend> friendsin;

	@Relationship(value = "Friendships_Outgoing")
	List<me.nuncan.hiringmodel.datasources.entity.User> usersincoming;

}
