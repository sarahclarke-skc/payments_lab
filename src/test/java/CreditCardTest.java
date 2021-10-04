import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class CreditCardTest {

    CreditCard creditCard;

    @Before
    public void before() {
        //not sure about the arraylist here
        ArrayList<Double> charges = new ArrayList<>();
        creditCard = new CreditCard("012345", "12/25", "432", charges , 5000.00, 1.5);
    }

    @Test
    public void hasCardNumber() {
        assertEquals("012345", creditCard.getCardNumber());
    }

    @Test
    public void canAddPaymentToCharges() {
        creditCard.charge(5.00);
        creditCard.charge(5.00);
        assertEquals(2, creditCard.getCharges().size());
        assertEquals(4990.00, creditCard.getCreditLimit(), 0.001);
    }

    @Test
    public void canGetTransactionFee() {
        creditCard.getTransactionFee(1000.00);
        assertEquals(4997.00, creditCard.getCreditLimit(), 0.001);
    }
}
