import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class AccountTest {
    String toCheck;
    boolean expected;

    public AccountTest(String toCheck, boolean expected) {
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
                {"", false},
                {" ", false},
                {"Timo Ty Shalle", false},
                {"Тимо Ти Шале", false},
                {" Tomoty Shalame", false},
                {"Tomoty Shalame ", false},
                {" Tomoty Shalame ", false},
                {" Тимоти Шаламе", false},
                {"Тимоти Шаламе ", false},
                {" Тимоти Шаламе ", false},
                {"Q", false},
                {"Ь", false},
                {"*", false},
                {"Timoty ShalameShalame", false},
                {"ТимотиТимоти ШаламеШаламе", false},
                {"&$*%(#&%*$&#^$%*(@#$%&*", false},
                {"&$*%(#&% *$&#^$%*(@#$%&*", false},
                {"* *", true},
                {"@#(*( @&&$*@", true},
                {"Timoty Shalame", true},
                {"Timoty ShalameShala", true},
                {"T S", true},
                {"Тимоти Шаламе", true},
                {"ТимотиТимоти Шаламе", true},
                {"Т Ш", true},
        };
    }

}