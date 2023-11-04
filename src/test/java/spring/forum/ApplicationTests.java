package spring.forum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ApplicationTests {

    @Test
    void forumUserTestSuite(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext("spring.forum");
                ForumUser forumUser = context.getBean(ForumUser.class);
        //When
        String userName = forumUser.username;
        //Then
        assertEquals("John Smith" , userName);
    }

    @Test
    void contextLoads() {
    }

}
