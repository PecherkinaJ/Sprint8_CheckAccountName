import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class TestNoSpaces {
    String toCheck;
    boolean expected;

    public TestNoSpaces(String toCheck, boolean expected) {
        this.toCheck = toCheck;
        this.expected = expected;
    }

    @Test
    @DisplayName("No spaces in the string")
    public void testCheckNameToEmboss(){
        Account account = new Account(toCheck);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }

    @Parameterized.Parameters(name="для <{0}> => {1}")
    public static Object[] data() {
        return new Object[][]{
                {"TomotyShalame", false},
                {"ТимотиШаламе", false},
                {"Q", false},
                {"Ь", false},
                {"*", false},
                {"&$*%(#&%*$&#^$%*(@#$%&*", false},
        };
    }

}
