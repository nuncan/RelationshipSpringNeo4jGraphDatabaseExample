package me.nuncan.hiringmodel

import me.nuncan.hiringmodel.datasources.Neo4j.repository.UserRepoNeo4j
import me.nuncan.hiringmodel.entity.Friend
import me.nuncan.hiringmodel.entity.Roles
import me.nuncan.hiringmodel.entity.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.context.TestComponent
import org.springframework.context.annotation.EnableAspectJAutoProxy
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories
import org.springframework.transaction.annotation.EnableTransactionManagement

@TestComponent
@SpringBootTest
@EnableNeo4jRepositories
@EnableAspectJAutoProxy
@EnableAutoConfiguration
@EnableTransactionManagement
class AppStartupRunnerTest extends ModelingHiringApplication {

    @Autowired
    protected UserRepoNeo4j userRepoNeo4j

    void setup() {
        assert userRepoNeo4j instanceof UserRepoNeo4j
    }

    static void cleanup() {

        System.out.println "Tests are Done!"
    }

    def "Run"() {

        setup()


        User userNick = new User()

        Friend friendChris = new Friend()
        Friend friendJohn = new Friend()


        Roles family = new Roles()
        Roles brother = new Roles()
        Roles engineer = new Roles()


        userNick.setName("Nick")
        userNick.setJobTitle("Software Engineer")
        userRepoNeo4j.save(userNick)


        friendChris.setName("Chris")
        friendChris.setJobTitle("Delivery Driver")


        friendJohn.setName("John")
        friendJohn.setJobTitle("Robotics Engineer")


        family.setUser(userNick)
        family.setFriend(friendChris)


        brother.setFriend(friendChris)
        brother.setUser(userNick)


        engineer.setUser(userNick)
        engineer.setFriend(friendJohn)


        Stack<Roles> rolesColl = new Stack<>()
        rolesColl.push(family)
        rolesColl.push(engineer)
        rolesColl.push(brother)

        userNick.setUserRoles(rolesColl)

        userRepoNeo4j.save(userNick)

        def results = userRepoNeo4j.findAllByJobTitle("Engineer")
        .toString().normalize()

        println(results)

        assert results != null

        cleanup()

    }

}
