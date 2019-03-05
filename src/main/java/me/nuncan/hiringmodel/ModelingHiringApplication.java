package me.nuncan.hiringmodel;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.couchbase.repository.config.EnableReactiveCouchbaseRepositories;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;

@Slf4j
@SpringBootConfiguration
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableNeo4jRepositories(basePackages = { "me.nuncan.hiringmodel.datasources.Neo4j" })
@EnableReactiveCouchbaseRepositories(basePackages = { "me.nuncan.hiringmodel.datasources.MongoDB" })
public class ModelingHiringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModelingHiringApplication.class, args);
	}

}
