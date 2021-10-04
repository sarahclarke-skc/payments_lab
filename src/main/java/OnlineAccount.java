import java.util.ArrayList;

public class OnlineAccount {

    private String name;
    private ArrayList<IChargeable> paymentMethods;
    private ArrayList<Double> transactions;

    public OnlineAccount(String name) {
        this.name = name;
        this.paymentMethods = new ArrayList<IChargeable>();
        this.transactions = new ArrayList<Double>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList getPaymentMethods() {
        return paymentMethods;
    }

    public void setPaymentMethods(ArrayList paymentMethods) {
        this.paymentMethods = paymentMethods;
    }

    public ArrayList getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList transactions) {
        this.transactions = transactions;
    }
}

//    public void addPaymentMethodToPaymentMethods(IChargeable)
//}
