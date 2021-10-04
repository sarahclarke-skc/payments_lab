import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiftCardTest {

    GiftCard giftCard;

    @Before
    public void before() {
        giftCard = new GiftCard("Next", 20.00);
    }

    @Test
    public void hasVendor() {
        assertEquals("Next", giftCard.getVender());
    }

    @Test
    public void hasZeroTransactionFee() {
        assertEquals(0, giftCard.getTransactionFee(5.00), 0.001);
    }

    @Test
    public void canReduceGiftCardBalance() {
        giftCard.charge(5.00);
        assertEquals(15.00, giftCard.getBalance(), 0.001);
    }
}
