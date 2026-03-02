package model;

public abstract class Account {
    
    protected String AccountNumber;
    protected String CustomerId;
    protected String PIN;
    protected double AccountBalance;
    protected boolean isActive;

   public Account(String AccountNumber, String CustomerId, String PIN, double AccountBalance){
        this.AccountNumber = AccountNumber;
        this.AccountBalance = AccountBalance;
        this.CustomerId = CustomerId;
        this.PIN = PIN;
        this.isActive = true;
   }

   public void deposit(double Amount){
        this.AccountBalance += Amount;
        System.out.println(Amount + " deposited sucessfully!");
   }

   public void withDraw(double Amount) throws Exception{
        if(!canWithDraw(Amount)){
            throw new Exception("You cannot withdraw this amount!");
        }
        this.AccountBalance -= Amount;
        System.out.println(Amount + " withdrawn sucessfully!");
   }

   protected abstract boolean canWithDraw(double amount);

   public double getBalance(){
        return this.AccountBalance;
   }

   public String getAccountNumber(){
        return this.AccountNumber;
   }

}
