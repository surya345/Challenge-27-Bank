import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Enter no of customers");
        int noOfCustomer = input.nextInt();
        Customer cust[] = new Customer[noOfCustomer];
        BankAccount bank[]= new BankAccount[cust.length];
        for(int i=0;i<noOfCustomer;i++)
        {
            cust[i] = new Customer();
            bank[i] = new BankAccount();
            cust[i].getCustomerDetails();
            bank[i].setCustomer(cust[i]);
          
        }

        int ch;
        String accNumb;
        do {
            System.out.println("\n\n################ SELECT THE OPERATION ##################");
            System.out.println("\n 1. Display All\n 2. Search By Account\n 3. Deposit\n 4. Withdrawal\n 5.Money Transfer ");
            System.out.println("########################################################");   
            System.out.println("Please enter ur Choice :");
                 ch = input.nextInt();
                switch (ch) {
                    case 1:
                    System.out.println("*************************************************************************************************************************************************");
                    System.out.printf("%-15s%-15s%-10s%-10s%-18s%-18s%-20s%-20s%-20s\n","First_Name","Last_Name","Age","Taluk","Mobile","Account Number","Balance","Intrest","Intrest_balance");
                    System.out.println("*************************************************************************************************************************************************");
                        for (int i = 0; i < bank.length; i++) {
                            bank[i].displayCustomerDetails();
                        }
                        break;

                    case 2:
                        System.out.print("Enter the taluk: ");
                     String taluk = input.next();
                        for (int i = 0; i < cust.length; i++) {
                           if(cust[i].taluk.equalsIgnoreCase(taluk)){
                               bank[i].displayCustomerDetails();
                               
                           }
                        }
                        break;

                    case 3:
                    System.out.print("Enter Account No to be Search...: ");
                    accNumb = input.next();
                    boolean flag2 = false;
                    for (int i = 0; i < cust.length; i++) {
                        flag2=cust[i].searchAccount(accNumb);
                        if(flag2)
                        {
                            bank[i].deposit();
                            break;
                        }
                        }
                        if(!flag2)
                        {
                            System.out.println("Account not found ");
                        }
                              
                        
                    break;

                    case 4:
                    System.out.print("Enter Account No to be Search...: ");
                    accNumb = input.next();
                    boolean flag3 = false;
                    for (int i = 0; i < cust.length; i++) {
                        flag3=cust[i].searchAccount(accNumb);
                        if(flag3)
                        {
                            bank[i].withdrawal();
                            break;
                        }
                        }
                        if(!flag3)
                        {
                            System.out.println("Account not found ");
                        }
                              
                        
                    break;
                        
                     case 5: System.out.println("Enter from account number to tranfer money: ");
                                String fromAccNumb= input.next();
                                System.out.println("Enter to account number to recieve money: ");
                                String toAccNumb= input.next();
                                float sentAmount=0f;
                                boolean flag5=false,flag4=false;
                                for (int i = 0; i < cust.length; i++) {
                                    flag4=cust[i].searchAccount(fromAccNumb) ;
                        
                                    if(flag4)
                                    {
                                       sentAmount = bank[i].moneyFromTransfer(fromAccNumb);
                                        break;
                                    }
                                    }
                                    if(!flag4)
                        {
                            System.out.println("Account not found ");
                        }
                        for (int i = 0; i < cust.length; i++) {
                            flag5= cust[i].searchAccount(toAccNumb);
                           
                            if(flag5)
                            {
                                bank[i].moneyToTransfer(sentAmount);
                                break;
                            }
                            }
                            if(!flag5)
                {
                    System.out.println("Account not found ");
                }
                break;

                    case 6:
                        System.out.println("Thanks for using the bank");
                        break;
                }
            }
            while (ch != 6);
        }


    }

