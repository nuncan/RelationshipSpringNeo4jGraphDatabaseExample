package me.nuncan.hiringmodel.datasources.Neo4j.repository;

import me.nuncan.hiringmodel.entity.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends Neo4jRepository<User, Long> {

    User findAllByName(String name);
}
