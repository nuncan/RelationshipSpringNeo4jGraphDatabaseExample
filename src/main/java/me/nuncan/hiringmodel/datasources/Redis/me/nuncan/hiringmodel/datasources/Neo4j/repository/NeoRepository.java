package me.nuncan.hiringmodel.datasources.Neo4j.repository;

import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface NeoRepository extends Neo4jRepository<me.nuncan.hiringmodel.datasources.entity.User, Long> {

}
