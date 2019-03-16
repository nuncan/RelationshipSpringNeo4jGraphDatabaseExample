package me.nuncan.hiringmodel;

import me.nuncan.hiringmodel.datasources.Neo4j.repository.UserRepoNeo4j;
import me.nuncan.hiringmodel.entity.Friend;
import me.nuncan.hiringmodel.entity.Roles;
import me.nuncan.hiringmodel.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@SpringBootApplication
@EnableConfigurationProperties
public class RelationshipSpringNeo4jGraphDatabaseExample{

	public static void main(String[] args){

		SpringApplication.run(RelationshipSpringNeo4jGraphDatabaseExample.class, args);
	}

	@Component
	public class Run implements ApplicationRunner{

		@Autowired UserRepoNeo4j userRepoNeo4j;


		@Override
		public void run(ApplicationArguments args) throws Exception{

			System.out.println("Inserting Mock Data");


			User userNick=new User();

			Friend friendChris=new Friend(); Friend friendJohn=new Friend();


			Roles family=new Roles(); Roles brother=new Roles(); Roles engineer=new Roles();


			userNick.setName("Nick"); userNick.setJobTitle("Software Engineer"); userRepoNeo4j.save(userNick);


			friendChris.setName("Chris"); friendChris.setJobTitle("Delivery Driver"); userRepoNeo4j.save(friendChris);

			friendJohn.setName("John"); friendJohn.setJobTitle("Robotics Engineer"); userRepoNeo4j.save(friendJohn);


			family.setUser(userNick); family.setFriend(friendChris);


			brother.setFriend(friendChris); brother.setUser(userNick);


			engineer.setUser(userNick); engineer.setFriend(friendJohn);

			userRepoNeo4j.save(family); userRepoNeo4j.save(brother); userRepoNeo4j.save(engineer);
		}
	}

}