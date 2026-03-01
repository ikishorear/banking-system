package model;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class Transaction {
    
    private String transactionId;
    private LocalDateTime transactionTime;
    private String type;
    private double amount;
    private String fromAccount;
    private String toAccount;
    private String status;

    public Transaction(double Amount, String type, String fromAccount, String toAccount, String status){
        this.transactionId = UUID.randomUUID().toString();
        this.transactionTime = LocalDateTime.now();
        this.type = type;
        this.amount = Amount;
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.status = status;
    }

    public String getTransactionId(){
        return this.transactionId;
    }

    public ArrayList<String> getTransactionDetails(){
        ArrayList<String> transactionDetails = new ArrayList<String>();
        transactionDetails.add(this.fromAccount);
        transactionDetails.add(this.toAccount);
        transactionDetails.add(this.type);
        transactionDetails.add(String.valueOf(this.amount));
        transactionDetails.add(this.status);
        transactionDetails.add(String.valueOf(transactionTime));
        return transactionDetails;
    }
}
