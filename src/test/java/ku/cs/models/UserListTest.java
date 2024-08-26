package ku.cs.models;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserListTest {

    @Test
    @DisplayName("User should be found in UserList")
    public void testUserListFindUser() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Nat", "Wee");
        userList.addUser("Nit", "Wuu");
        userList.addUser("Nut", "Woo");
        // TODO: find one of them
        User expectedUser = userList.findUserByUsername("Nat");
        // TODO: assert that UserList found User
        // String expected = "<one of username>";
        // String actual = user.getUsername();
        // assertEquals(expected, actual);
        String expected = "Nat";
        String actual = expectedUser.getUsername();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("User can change password")
    public void testUserCanChangePassword() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Mick", "She");
        userList.addUser("Muck", "Shu");
        userList.addUser("Mack", "Sho");
        // TODO: change password of one user
        userList.changePassword("Mack", "Sho" , "Shi");
        // TODO: assert that user can change password
        boolean actual = userList.changePassword("Mack", "Shi" , "Sha");
         assertTrue(actual);
    }

    @Test
    @DisplayName("User with correct password can login")
    public void testUserListShouldReturnObjectIfUsernameAndPasswordIsCorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Yon", "Ra");
        userList.addUser("Yan", "Ri");
        userList.addUser("Yin", "Ro");
        // TODO: call login() with correct username and password
        User expectedUser = userList.login("Yon" , "Ra");
        // TODO: assert that User object is found
         assertEquals("Yon", expectedUser.getUsername());
    }

    @Test
    @DisplayName("User with incorrect password cannot login")
    public void testUserListShouldReturnNullIfUsernameAndPasswordIsIncorrect() {
        // TODO: add 3 users to UserList
        UserList userList = new UserList();
        userList.addUser("Vic", "Jae");
        userList.addUser("Vac", "Joe");
        userList.login("Voc", "Jie");
        // TODO: call login() with incorrect username or incorrect password
        User expectedUser = userList.login("Voc", "Joe");
        // TODO: assert that the method return null
         assertNull(expectedUser);
    }

}