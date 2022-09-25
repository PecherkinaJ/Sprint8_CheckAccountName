import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class JustToCheck {

    @Test
    public void toCheck(){
        Account account = new Account("jnnj njnj");
        assertTrue(account.checkNameToEmboss());
    }
}
