package me.nuncan.hiringmodel;

import lombok.Generated;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.aspectj.EnableSpringConfigured;
import org.springframework.data.couchbase.repository.config.EnableReactiveCouchbaseRepositories;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableReactiveMethodSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.web.reactive.config.EnableWebFlux;

import javax.servlet.annotation.WebServlet;

@Generated
@EnableNeo4jRepositories
@EnableReactiveCouchbaseRepositories
@EnableReactiveMethodSecurity
@EnableAutoConfiguration
public class ModelingHiringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ModelingHiringApplication.class, args);
	}

}
