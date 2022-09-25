import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTestTooMuchLetters {


    String toCheck;
    boolean expected;

    public AccountTestTooMuchLetters(String toCheck, boolean expected) {
        this.toCheck = toCheck;
        this.expected = expected;
    }

    @Test
    public void testCheckNameToEmboss(){
        Account account = new Account(toCheck);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }

    @Parameterized.Parameters
    public static Object[] data() {
        return new Object[][]{
                {"Timoty ShalameShalame", false},
                {"ТимотиТимоти ШаламеШаламе", false},
                {"&$*%(#&% *$&#^$%*(@#$%&*", false},
        };
    }
}
