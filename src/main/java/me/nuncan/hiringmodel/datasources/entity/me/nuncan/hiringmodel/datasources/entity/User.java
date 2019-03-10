package me.nuncan.hiringmodel.datasources.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

@Data
@Generated
@NodeEntity
@AllArgsConstructor
public class User {

	@Id
	@GeneratedValue
	Long Id;

	@Relationship
	String name;

	/**  User Login Stuff  **/
	String Username;

	String Email;

	String Password;

	String CreatorIP;

	boolean Enabled;

	boolean accountNonExpired;

	boolean credentialsNonExpired;

	boolean accountNonLocked;

	@Relationship(value = "Roles", direction = Relationship.INCOMING)
	Set<Roles> User_Roles = new HashSet<>();

	/**  User Login Stuff  **/

	@Relationship(value = "Friendships_Incoming", direction = Relationship.INCOMING)
	List<Friend> friendsin;

	@Relationship
	LinkedHashMap<User, Friend> userFriendMap;

}
