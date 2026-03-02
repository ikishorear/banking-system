package service;

import model.*;
import java.util.*;


public class BankService {
    
    private HashMap<String, Customer> customers = new HashMap<String, Customer>();
    private HashMap<String, Account> accounts = new HashMap<String, Account>();
    private HashMap<String, Transaction> transactions = new HashMap<String, Transaction>();

    // transaction
    private void createTransaction(double amount, String type, String from, String to, String status){
        String TransId = UUID.randomUUID().toString();
        Transaction t1 = new Transaction(amount, type, from, to, status);
        transactions.put(TransId, t1);
    }

    // create a new customer
    public Customer createCustomer(String name, String phone, String email){
        String CId = UUID.randomUUID().toString();
        Customer cus = new Customer(name, phone, email);
        customers.put(CId, cus);
        return cus;
    }

    // open savings account
    public Account openSavingsAccount (String customerId, double iniDep, String pin){
        String AccountNo = UUID.randomUUID().toString();
        Account Acc = new SavingsAccount(AccountNo, customerId, pin, iniDep);
        accounts.put(AccountNo, Acc);
        return Acc;
    }

    // open current account
    public Account openCurrentAccount (String customerId, double iniDep, String pin){
        String AccountNo = UUID.randomUUID().toString();
        Account Acc = new CurrentAccount(AccountNo, customerId, pin, iniDep);
        accounts.put(AccountNo, Acc);
        return Acc;
    }

    // deposit
    public void deposit(String AccNo, double money){
        Account acc = accounts.get(AccNo);
        if (acc == null)
            throw new RuntimeException("Account not found!");
        acc.deposit(money);
        createTransaction(money, "DEPOSIT", AccNo, null, "Sucess");
    }

    // withdraw
    public void withdraw(String AccNo, double money){
        Account acc = accounts.get(AccNo);
        if (acc == null)
            throw new RuntimeException("Account not found!");
        
        try { 
            acc.withDraw(money);
            createTransaction(money, "WITHDRAW", AccNo, null, "Sucess");
        } catch (Exception e) {
            createTransaction(money, "WITHDRAW", AccNo, null, "Sucess");
            throw new RuntimeException("Transaction failed! : " + e.getMessage());
        }
    }

    // transfer
    public void transfer(String fromAcc, String toAcc, double money){
        Account sender = accounts.get(fromAcc);
        Account reciever = accounts.get(toAcc);

        if(sender == null || reciever == null)
            throw new RuntimeException("Accounts not found!");

        try {
            sender.withDraw(money);
            reciever.deposit(money);
            createTransaction(money, "TRANSFER", fromAcc, toAcc, "Sucess");
        } catch (Exception e) {
            createTransaction(money, "WITHDRAW", fromAcc, toAcc, "Sucess");
            throw new RuntimeException("Transaction failed! : " + e.getMessage());
        }
    }


}
