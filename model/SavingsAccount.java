package model;

public class SavingsAccount extends Account{
    
    public SavingsAccount(String AccountNumber, String CustomerId, String PIN, double AccountBalance ){
        super(AccountNumber, CustomerId, PIN, AccountBalance);
    }

    @Override
    protected boolean canWithDraw(double amount){
        return this.AccountBalance >= amount;
    }

}
