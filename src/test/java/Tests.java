import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

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

        User specUser = new User("user", "qwertyuio*", "user@mail.com");
        assertTrue(SILab2.function(specUser, allUsers));

        User badPassword = new User("user", "qwert yuio*", "user@mail.com");
        assertFalse(SILab2.function(badPassword, allUsers));
        
        User gooduser = new User("user", "qwertyuio", "user@mail.com");
        assertTrue(SILab2.function(gooduser, allUsers));
    }
    @Test
    void multipleConditionTest(){
        List<User> allUsers = createList();
        RuntimeException ex;
        
        //TXX
        User nullUser = null;
        ex = assertThrows(RuntimeException.class, ()->SILab2.function(nullUser, allUsers));
        assertTrue(ex.getMessage().contains("Mandatory information missing"));

        //FTX
        User nullpasswordUser = new User("user", "", "email");
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(nullpasswordUser,allUsers));
        assertTrue(ex.getMessage().contains("Mandatory information missing"));

        //FFT
        User nullemailUser = new User("user", "password", "");
        ex = assertThrows(RuntimeException.class, () -> SILab2.function(nullemailUser, allUsers));
        assertTrue(ex.getMessage().contains("Mandatory information missing"));

        //FFF
        User goodUser = new User("user", "password", "email");
        assertFalse(SILab2.function(goodUser, allUsers));
    }
}
