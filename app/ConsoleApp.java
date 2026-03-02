package app;

import service.BankService;
import java.util.Scanner;

public class ConsoleApp {
    
    private static BankService B1 = new BankService();
    private static Scanner console = new Scanner(System.in);

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
