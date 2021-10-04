public interface IChargeable {
    double getTransactionFee(double purchaseAmount);
    double charge(double purchaseAmount);

}


