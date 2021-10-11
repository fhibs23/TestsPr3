import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;
    @BeforeEach
    public void setUp(){
        user = new User();
    }
    @org.junit.jupiter.api.Test
    void setName() {
        user.setName("John");
        Assertions.assertEquals("John", user.getName());
    }

    @org.junit.jupiter.api.Test
    void setAge() {
        user.setAge(23);
        Assertions.assertEquals(23, user.getAge());

    }

    @org.junit.jupiter.api.Test
    void setSex() {
        user.setSex("М");
        Assertions.assertEquals("М", user.getSex());

    }

    @org.junit.jupiter.api.Test
    void setType() {
        user.setType(2);
        Assertions.assertEquals(2,user.getType());
    }
}