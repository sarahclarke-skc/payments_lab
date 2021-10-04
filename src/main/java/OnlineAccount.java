import java.util.ArrayList;

public class OnlineAccount {

    private String name;
    private ArrayList paymentMethods;
    private ArrayList transactions;

    public OnlineAccount(String name, ArrayList<String> paymentMethods, ArrayList<Double> transactions) {
        this.name = name;
        this.paymentMethods = paymentMethods;
        this.transactions = transactions;
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
