import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class OnlineAccountTest {

    OnlineAccount onlineAccount;

    @Before
    public void before() {
        onlineAccount = new OnlineAccount("Jane Smith");
        //add instances of credit, debit, and gift
    }

    @Test
    public void hasName() {
        assertEquals("Jane Smith", onlineAccount.getName());
    }
}
