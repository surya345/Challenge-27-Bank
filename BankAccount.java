import java.util.Scanner;

public class BankAccount {
    static float intAmt=0 , intBalance=0;
   static Scanner input = new Scanner(System.in);
    Customer customer;
    public float balance;
    public float intrest;

    public BankAccount() {
    }

    public BankAccount(Customer customer, float balance, float intrest) {
        this.customer = customer;
        this.balance = balance;
        this.intrest = intrest;
    }

    
    
    public void displayCustomerDetails()
    {
        
        System.out.printf("%-15s%-15s%-10d%-10s%-18s%-18s%-20f%-20f%-20f\n",customer.fname,customer.lname,customer.age,customer.taluk,customer.mobile,customer.account,balance,intrest,intBalance);
        System.out.println(".........................................................................................................................................");
     
    }


    //method to deposit money
    void deposit() {
        float amount;
        System.out.println("Enter Deposit amount : ");
        amount = input.nextFloat();
        balance = balance + amount;
        intAmt=addInterest(balance,customer.age);
        intBalance=(balance*intAmt);
    }

    private float addInterest(float balance2, int age) {
        if(age >= 50)
        {
            intrest = 0.25f;
        }
        else
        {
            intrest = 0.10f;
        }
        
    return intrest;
    }

    // method to withdraw money
    void withdrawal() {
        float amount;
        System.out.println("Enter withdrawal/send amount : ");
        amount = input.nextFloat();
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Low Balance..Transaction Failed..");
        }
        intAmt=addInterest(balance,customer.age);
        intBalance=(balance*intAmt);
    }

    float moneyFromTransfer(String fromAccNumb){
        float amount;
        System.out.println("Enter withdrawal/send amount : ");
        amount = input.nextFloat();
        if (balance >= amount) {
            balance = balance - amount;
        } else {
            System.out.println("Low Balance..Transaction Failed..");
        }
        intAmt=addInterest(balance,customer.age);
        intBalance=(balance*intAmt);
        return amount;
    }

    void moneyToTransfer(float sentAmount)
    {
        
        balance = balance + sentAmount;
        intAmt=addInterest(balance,customer.age);
        intBalance=(balance*intAmt);
        System.out.println("Money sucessfully transfered. Please check the balance");
    }





    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getIntrest() {
        return intrest;
    }

    public void setIntrest(float intrest) {
        this.intrest = intrest;
    }

    
}
