import java.util.Random;
import java.util.Scanner;

class Customer {
static Scanner input = new Scanner(System.in);
    public String fname;
    public String lname;
    public String taluk;
    public String mobile="+91-";
    public int age;
    public String account;

    public Customer() {
    }

    public Customer(String fname, String lname, String taluk, String mobile, int age, String account) {
        this.fname = fname;
        this.lname = lname;
        this.taluk = taluk;
        this.mobile = mobile;
        this.age = age;
        this.account = account;
    }


    public boolean searchAccount(String accountNumber)
    {
        if(accountNumber.equals(account))
        { 
            return true;
        }
        return false;

    }
    public void getCustomerDetails()
    {
        System.out.println("Enter the customer first name");
        fname = input.next();
        System.out.println("Enter the customer last name");
        lname = input.next();
        System.out.println("Enter your age:");
        age = input.nextInt();
        System.out.println("Enter the customer taluk name");
        taluk = input.next();
        System.out.println("Enter the customer mobile name");
        String mobNumb = input.next();
        numberValidation(mobNumb);
       account=generateAcoountNumber();
       System.out.println("--------------------------------------------------------------");
    }

   
    
    public String generateAcoountNumber() {

       String start = "SB";
        Random value = new Random();

    //Generate two values to append to 'BE'
    int r1 = value.nextInt(10);
    int r2 = value.nextInt(10);
    start += Integer.toString(r1) + Integer.toString(r2) + "";

    int count = 0;
    int n = 0;
    for(int i =0; i < 10;i++)
    {
        if(count == 4)
        {
            start += "";
            count =0;
        }
        else 
            n = value.nextInt(10);
            start += Integer.toString(n);
            count++;            

    }
    
    return start;
    }

    public void numberValidation(String mobNumb) {
        if(mobNumb.length()>10 )
        {
            System.out.println("Invalid number");
            
        }
        else{
            mobile+=mobNumb;
        }
    }



    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getTaluk() {
        return taluk;
    }

    public void setTaluk(String taluk) {
        this.taluk = taluk;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    
}