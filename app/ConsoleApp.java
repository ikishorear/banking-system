package app;

import service.BankService;
import java.util.Scanner;

public class ConsoleApp {
    
    private static BankService B1 = new BankService();
    private static Scanner console = new Scanner(System.in);

    private static void createCustomer(){
        System.out.println("Enter your name : ");
        String name = console.nextLine();

        System.out.println("Enter your phone number : ");
        String phone = console.nextLine();

        System.out.println("Enter your email address : ");
        String email = console.nextLine();

        var cus = B1.createCustomer(name, phone, email);
        System.out.println("Customer created sucessfully! " + cus);
    }

    private static void openSavingsAccount(){
        System.out.println("Enter customer ID : ");
        String cusId = console.nextLine();

        System.out.println("Enter the inital deposit : ");
        double initDep = console.nextDouble();
        console.nextLine();

        System.out.println("Enter your PIN : ");
        String pin = console.nextLine();

        var Acc = B1.openSavingsAccount(cusId, initDep, pin);
        System.out.println("Savings account created sucessfully! " + Acc);
    }

    private static void openCurrentAccount(){
        System.out.println("Enter customer ID : ");
        String cusId = console.nextLine();

        System.out.println("Enter init deposit : ");
        double initDep = console.nextDouble();
        console.nextLine();

        System.out.println("Enter your PIN : ");
        String pin = console.nextLine();

        var Acc = B1.openCurrentAccount(cusId, initDep, pin);
        System.out.println("Current account created sucessfully!" + Acc);
    }

    private static void Deposit(){
        System.out.println("Enter customer ID : ");
        String cusId = console.nextLine();

        System.out.println("Enter deposit amount : ");
        double deposit = console.nextDouble();

        B1.deposit(cusId, deposit);
        System.out.println("Your amount have been deposited sucessfully!");
    }

    private static void Withdraw(){
        System.out.println("Enter customer ID : ");
        String cusId = console.nextLine();

        System.out.println("Enter withdraw amount : ");
        double amount = console.nextDouble();

        B1.withdraw(cusId, amount);
        System.out.println("Your amount have been withdrawn sucessfully!");
    }

    private static void Transfer(){
        System.out.println("Enter from account : ");
        String fromId = console.nextLine();

        System.out.println("Enter to account : ");
        String toId = console.nextLine();

        System.out.println("Enter the amount to be transfered : ");
        double amount = console.nextDouble();

        B1.transfer(fromId, toId, amount);
        System.out.println("Amount has been transfered from " + fromId + " to " + toId);
    }

    public static void main(String[] args) {
        
        boolean running = true;

        while (running) {
            
            System.out.println("===Bank Menu===");
            System.out.println("1. Create Customer");
            System.out.println("2. Open Savings Account");
            System.out.println("3. Open Current Account");
            System.out.println("4. Deposit");
            System.out.println("5. Withdraw");
            System.out.println("6. Transfer");
            System.out.println("7. Exit");

            int choice = console.nextInt();
            console.nextLine();

            switch (choice) {
                case 1:
                    createCustomer();
                    break;
                
                case 2:
                    openSavingsAccount();
                    break;
                
                case 3:
                    openCurrentAccount();
                    break;
                
                case 4:
                    Deposit();
                    break;
                
                case 5:
                    Withdraw();
                    break;
                
                case 6:
                    Transfer();
                    break;
                
                case 7:
                    running = false;
                    break;
            
                default:
                    System.out.println("Invalid option!");
                    break;
            }

        }
    }

}
