package me.nuncan.hiringmodel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@SpringBootApplication
@EnableNeo4jRepositories(basePackages = { "me.nuncan.hiringmodel.datasources.Redis.repository" })
@EnableReactiveMongoRepositories
public class ModelingHiringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModelingHiringApplication.class, args);
	}

}
