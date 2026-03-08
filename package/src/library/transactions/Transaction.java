package library.transactions;

public class Transaction {
    private final String transactionId;

    public Transaction(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionId() {
        return transactionId;
    }
}