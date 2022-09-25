import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AccountTestEmptyString {
    String toCheck;
    boolean expected;

    public AccountTestEmptyString(String toCheck, boolean expected) {
        this.toCheck = toCheck;
        this.expected = expected;
    }

    @Test
    public void testCheckNameToEmboss(){
        Account account = new Account(toCheck);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }

    @Parameterized.Parameters(name="для <{0}> => {1}")
    public static Object[] data() {
        return new Object[][]{
                {"", false},
                {" ", false},
        };
    }

}