import java.util.ArrayList;

public abstract class PaymentCard implements IChargeable {
    private String cardNumber;
    private String expiryDate;
    private String CVC;
    private ArrayList charges;

    public PaymentCard(String cardNumber, String expiryDate, String CVC, ArrayList charges) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.CVC = CVC;
        this.charges = charges;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String getCVC() {
        return CVC;
    }

    public ArrayList getCharges() {
        return charges;
    }

    public void setCharges(ArrayList charges) {
        this.charges = charges;
    }

    public double getTransactionFee(double purchaseAmount) {
        return purchaseAmount;
    }

    public double charge(double purchaseAmount) {
        return purchaseAmount;
    }
}


