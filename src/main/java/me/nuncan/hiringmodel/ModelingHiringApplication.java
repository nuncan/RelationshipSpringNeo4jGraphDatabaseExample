package me.nuncan.hiringmodel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@EnableRedisHttpSession
@SpringBootApplication
@EnableNeo4jRepositories(basePackages = { "me.nuncan.hiringmodel.datasources.Neo4j" })
@EnableReactiveMongoRepositories(basePackages = { "me.nuncan.hiringmodel.datasources.MongoDB" })
public class ModelingHiringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModelingHiringApplication.class, args);
	}

}
