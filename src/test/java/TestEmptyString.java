import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class TestEmptyString {
    String toCheck;
    boolean expected;

    public TestEmptyString(String toCheck, boolean expected) {
        this.toCheck = toCheck;
        this.expected = expected;
    }

    @Test
    @DisplayName("Check empty string and one space in it")
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