package me.nuncan.hiringmodel.repository;

import me.nuncan.hiringmodel.entity.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.CrudRepository;

import lombok.Generated;
import org.springframework.stereotype.Repository;

public interface UserRepository extends Neo4jRepository<User, Long> {

}
