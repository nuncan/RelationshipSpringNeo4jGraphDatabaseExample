package me.nuncan.hiringmodel.entity;

import java.util.List;

import lombok.Data;
import lombok.Generated;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Property;
import org.neo4j.ogm.annotation.Relationship;

@Data
@Generated
@NodeEntity
public class User {

	@Id
	@GeneratedValue
	Long id;
	
	@Property
	String name;

	@Relationship
	List<User> friends;


	public User(String constName) {
		this.name = constName;
	}
}
