import java.util.ArrayList;

public class DebitCard extends PaymentCard {

    private String sortCode;
    private String accountNumber;

    public DebitCard(String cardNumber, String expiryDate, String CVC, ArrayList charges, String sortCode, String accountNumber) {
        super(cardNumber, expiryDate, CVC, charges);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
    }

    public String getSortCode() {
        return sortCode;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void charge(double purchaseAmount) {
        addCharge(purchaseAmount);
    }
}
