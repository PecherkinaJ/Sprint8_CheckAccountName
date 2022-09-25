import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestJustToCheck {

    @Test
    @DisplayName("Checking work if this test with correct data")
    public void toCheck(){
        Account account = new Account("jnnj njnj");
        assertTrue(account.checkNameToEmboss());
    }
}
