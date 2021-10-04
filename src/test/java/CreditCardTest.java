import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before() {
        ArrayList<Double> charges = new ArrayList<>();
        creditCard = new CreditCard("012345", "12/25", "432", charges , 5000.00, 12.00);
    }

    @Test
    public void hasCardNumber() {
        assertEquals("012345", creditCard.getCardNumber());
    }
}
