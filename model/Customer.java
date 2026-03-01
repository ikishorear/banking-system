package model;
import java.util.UUID;

public class Customer {
    
    private String customerId;
    private String customerName;
    private String phone;
    private String email;

    public Customer(String cName, String phone, String email){
        this.customerName = cName;
        this.phone = phone;
        this.email = email;
        this.customerId = UUID.randomUUID().toString();
    }

    public String getCustomerId(){
        return this.customerId;
    }

    public String getPhone(){
        return this.phone;
    }

    public void updatePhone(String phone){
        this.phone = phone;
        System.out.println("Phone number updated!");
    }

    public String getEmail(){
        return this.email;
    }

    public void updateEmail(String email){
        this.email = email;
        System.out.println("Email updated!");
    }

    public String getName(){
        return this.customerName;
    }

}
