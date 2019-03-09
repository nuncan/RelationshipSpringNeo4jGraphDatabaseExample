package me.nuncan.hiringmodel.datasources.Neo4j.repository;

import me.nuncan.hiringmodel.datasources.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface NeoRepository extends Neo4jRepository<User, Long> {

}
