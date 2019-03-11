package me.nuncan.hiringmodel;

import lombok.Generated;
import lombok.extern.slf4j.Slf4j;
import me.nuncan.hiringmodel.entity.Friend;
import me.nuncan.hiringmodel.entity.Roles;
import me.nuncan.hiringmodel.entity.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class AppStartupRunner implements ApplicationRunner {


        @Autowired
    public void run(ApplicationArguments args)  {

            User user1 = new User("John");
            User user2 = new User("Nick");
            User user3 = new User("John");
            User user4 = new User("Alice");

            Friend friend1 = new Friend("fbf");

            user1.addFriend(friend1);
            user2.addFriend(friend1);
            user3.addFriend(friend1);
            user4.addFriend(friend1);

            friend1.addFriend(user3);
    }

}