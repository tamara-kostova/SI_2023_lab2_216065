import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class Tests {
    private List<User> createList(User... elems) {
        return new ArrayList<>(Arrays.asList(elems));
    }
    @Test
    void everyBranchTest(){
        List<User> allUsers = createList();

        RuntimeException ex;
        User nullUser = null;
        assertFalse(SILab2.function(nullUser, allUsers));
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(nullUser, allUsers));
        assertTrue(ex.getMessage().contains("Mandatory information missing"));

        User nullUsername = new User(null, "user", "user");
        assertFalse(SILab2.function(nullUsername, allUsers));

        User goodUser = new User("user", "qwertyuio*", "user@test.com");
        assertTrue(SILab2.function(goodUser, allUsers));

        User badPassword = new User("user", "qwert yuio*", "user@test.com");
        assertFalse(SILab2.function(badPassword, allUsers));
    }
    @Test
    void multipleConditionTest(){
        //TXX
        User nullUser = null;
        List<User> allUsers = createList();
        assertFalse(SILab2.function(nullUser, allUsers));

        //FTX
        User nullpasswordUser = new User("user", "", "email");
        assertFalse(SILab2.function(nullpasswordUser, allUsers));

        //FFT
        User nullemailUser = new User("user", "password", "");
        assertFalse(SILab2.function(nullemailUser, allUsers));

        //FFF
        User goodUser = new User("user", "password", "email");
        assertFalse(SILab2.function(goodUser, allUsers));

    }
}
