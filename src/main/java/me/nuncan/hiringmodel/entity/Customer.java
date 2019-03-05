package me.nuncan.hiringmodel.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import org.neo4j.ogm.annotation.*;

@Data
@Generated
@NodeEntity
@AllArgsConstructor
public class Customer {

	@Id
	@GeneratedValue
	Long Id;

	@Relationship
	String name;

	@EndNode
	@Relationship(value = "customer")
	Customer customer;

	@StartNode
	@Relationship(value = "friendship")
	User user;
}
