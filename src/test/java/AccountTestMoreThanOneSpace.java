import io.qameta.allure.junit4.DisplayName;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AccountTestMoreThanOneSpace {

    String toCheck;
    boolean expected;

    public AccountTestMoreThanOneSpace(String toCheck, boolean expected) {
        this.toCheck = toCheck;
        this.expected = expected;
    }

    @Test
    @DisplayName("Check string with extra spaces")
    public void testCheckNameToEmboss(){
        Account account = new Account(toCheck);
        boolean actual = account.checkNameToEmboss();
        assertEquals(expected, actual);
    }

    @Parameterized.Parameters(name="для <{0}> => {1}")
    public static Object[] data() {
        return new Object[][]{
                {"Timo Ty Shalle", false},
                {" Timoty Shalame", false},
                {"Timoty Shalame ", false},
                {" Timoty Shalame ", false},
                {"Тимо Ти Шале", false},
                {"Тимоти Шаламе ", false},
                {" Тимоти Шаламе ", false},
                {" ТимотиШаламе ", false},
        };
    }


}
