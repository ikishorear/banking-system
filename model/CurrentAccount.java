package model;

public class CurrentAccount extends Account {
    
    private static double DRAFT_LIMIT = 2000;

    public CurrentAccount(String AccountNumber, String CustomerId, String PIN, double AccountBalance){
        super(AccountNumber, CustomerId, PIN, AccountBalance);
    }

    @Override
    protected boolean canWithDraw(double Amount){
        return (this.AccountBalance + DRAFT_LIMIT) >= Amount;
    }

    public void changeDraftLimit(double increment){
        CurrentAccount.DRAFT_LIMIT += increment;
    }

}
