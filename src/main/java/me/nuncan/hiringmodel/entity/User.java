package me.nuncan.hiringmodel.entity;

import lombok.Data;
import lombok.Generated;
import lombok.RequiredArgsConstructor;
import org.neo4j.ogm.annotation.*;

@Data
@Generated
@NodeEntity
@RequiredArgsConstructor
public class User {

	@Id
	@GeneratedValue
	Long Id;

	@Property
	String name;

	@Relationship
	Customer customer;
}
