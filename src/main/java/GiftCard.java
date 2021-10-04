public class GiftCard implements IChargeable {

    private String vender;
    private double balance;

    public GiftCard(String vender, double balance) {
        this.vender = vender;
        this.balance = balance;
    }

    public String getVender() {
        return vender;
    }

    public void setVender(String vender) {
        this.vender = vender;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTransactionFee(double purchaseAmount) {
        return 0;
    }

    public void charge(double purchaseAmount) {
        balance -= purchaseAmount;
    }
}
