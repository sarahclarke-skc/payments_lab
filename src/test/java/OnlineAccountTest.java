import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class OnlineAccountTest {

    OnlineAccount onlineAccount;

    @Before
    public void before() {
        ArrayList<String> paymentMethods = new ArrayList<>();
        ArrayList<Double> transactions = new ArrayList<>();
        onlineAccount = new OnlineAccount("Jane Smith", paymentMethods, transactions);
    }

    @Test
    public void hasName() {
        assertEquals("Jane Smith", onlineAccount.getName());
    }
}
