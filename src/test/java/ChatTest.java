import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class ChatTest {
    User currentUser;

    Chat chat;

    @BeforeEach
    void setUp(){
        this.chat = new Chat();
        chat.setCurrentUser(new User());
    }
    @Test
    void setUserNameTest() {
        String input = "John";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        chat.setUserName();
        Assertions.assertEquals("John", chat.getCurrentUser().getName());
    }

    @Test
    public void setClientNameTestNoLineFound(){

        String input = "1234";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        Assertions.assertThrows(NoSuchElementException.class, () -> chat.setUserName());
    }

    @Test
    public void setClientSexTest(){

        String input = "М";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        chat.setUserSex();
        Assertions.assertEquals("М", chat.getCurrentUser().getSex());
    }


    @Test
    public void setClientSexTestNoLineFound(){

        String input = "af";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Assertions.assertThrows(NoSuchElementException.class, () -> chat.setUserSex());
    }

    @Test
    public void setClientAgeTest(){

        String input = "15";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        chat.setUserAge();

        Assertions.assertEquals(15, chat.getCurrentUser().getAge());
    }

    @Test
    public void setClientAgeTestNoLineFound(){

        String input = "0.3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Assertions.assertThrows(NoSuchElementException.class, () -> chat.setUserAge());

    }

    @Test
    public void setUserTypeTest(){

        String input = "3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        chat.setUserType();

        Assertions.assertEquals(3, chat.getCurrentUser().getType());
    }


    @Test
    public void setClientPainTypeTestNoLineFound(){

        String input = "6";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        Assertions.assertThrows(NoSuchElementException.class, () -> chat.setUserType());

    }
}