package userTest;

import org.junit.jupiter.api.Test;
import user.User;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void getUserNameTest(){
        User user = new User("Username", "Password");
        String expected = "Username";
        String actual = user.getUserName();
        assertEquals(expected, actual);
    }

    @Test
    public void getPasswordTest(){
        User user = new User("Username", "Password");
        String expected = "Password";
        String actual = user.getPassword();
        assertEquals(expected, actual);
    }

    @Test
    public void changeUserNameTest(){
        User user = new User("Username", "Password");
        user.setUserName("Isa");
        String expected = "Isa";
        String actual = user.getUserName();
        assertEquals(expected, actual);
    }
}
