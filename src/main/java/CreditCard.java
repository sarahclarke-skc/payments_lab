import java.util.ArrayList;

public class CreditCard extends PaymentCard {

    private double creditLimit;
    private double riskMultiplier;

    public CreditCard(String cardNumber, String expiryDate, String CVC, ArrayList charges, double creditLimit, double riskMultiplier) {
        super(cardNumber, expiryDate, CVC, charges);
        this.creditLimit = creditLimit;
        this.riskMultiplier = riskMultiplier;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getRiskMultiplier() {
        return riskMultiplier;
    }

    public void setRiskMultiplier(double riskMultiplier) {
        this.riskMultiplier = riskMultiplier;
    }

    public void charge(double purchaseAmount) {
        addCharge(purchaseAmount);
        creditLimit -= purchaseAmount;
    }

    public double getTransactionFee(double purchaseAmount) {
        return creditLimit -= (2*riskMultiplier);
    }
}
