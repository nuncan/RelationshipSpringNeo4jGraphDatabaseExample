package me.nuncan.hiringmodel.datasources.Neo4j.repository;

import me.nuncan.hiringmodel.entity.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@EnableNeo4jRepositories
public interface NeoRepository extends Neo4jRepository<User, Long> {

}
