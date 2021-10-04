import java.util.ArrayList;

public class CreditCard extends PaymentCard {

    private double creditLimit;
    private double riskMultiplier;

    public CreditCard(String cardNumber, String expiryDate, String CVC, ArrayList charges, double creditLimit, double riskMultiplier) {
        super(cardNumber, expiryDate, CVC, charges);
        this.creditLimit = creditLimit;
        this.riskMultiplier = riskMultiplier;
    }
}
