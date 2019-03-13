package me.nuncan.hiringmodel.datasources.Neo4j.repository;

import me.nuncan.hiringmodel.entity.User;
import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface UserRepoNeo4j extends Neo4jRepository<User, Long> {


    Optional<User> findById(@Param("Id") Long Id);

    @Query("MATCH (n:User) WHERE n.jobTitle =~ ('(?i).*'+{jobTitle}+'.*') RETURN n")
    Collection<User> findAllByJobTitle(@Param("jobTitle") String name);

}
