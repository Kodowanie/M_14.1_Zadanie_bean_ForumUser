package spring.forum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
        ForumUser forumUser = new ForumUser();
        System.out.println(forumUser.username);
    }

}
