package service;

import model.*;
import java.util.*;


public class BankService {
    
    private HashMap<String, Customer> customers = new HashMap<String, Customer>();
    private HashMap<String, Account> accounts = new HashMap<String, Account>();
    private HashMap<String, Transaction> transactions = new HashMap<String, Transaction>();

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

}
