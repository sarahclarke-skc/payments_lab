import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class DebitCardTest {

    DebitCard debitCard;

    @Before
    public void before() {
        ArrayList<Double> charges = new ArrayList<>();
        debitCard = new DebitCard("012345", "12/25", "432", charges , "9876", "56789");
    }

    @Test
    public void hasCardNumber() {
        assertEquals("012345", debitCard.getCardNumber());
    }
}