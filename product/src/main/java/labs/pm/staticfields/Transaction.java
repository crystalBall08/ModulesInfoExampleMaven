package labs.pm.staticfields;

public class Transaction {
    private static int counter = 0;
    private int transactionID;
    private String customerName;

    public void executeTransaction(String customerName) {
        transactionID = counter;
        counter++;
        this.customerName = customerName;
    }

    public static void xxx(){
        counter++;
//        transactionID = 0;
    }
}
