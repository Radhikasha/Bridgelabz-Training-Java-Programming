package encapsulation;

public class BankAccount {
    int accountNumber;
    private int balance;

    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    void display(){
        System.out.println("Before changes value, the account Number is: "+accountNumber + " and balance is: "+balance );
    }

    public int getaccountNumber(){
        return accountNumber;
    }
    public int getbalance(){
        return balance;
    }
    public void setaccountNumber(int no){
        this.accountNumber = no;

    }
     public void setbalance(int no){
        this.balance = no;

    }

    public void deposit(int amount){
        balance += amount;
        System.out.println("After deposit ammount, your balance is: "+balance + " and account number is: "+accountNumber);
    }
    public void withdrawl(int amount){
        balance -= amount;
        System.out.println("After withdrwal amount, your balance is: "+balance +" and account number is: "+accountNumber);
    }


    
    
}
class compute{
    public static void main(String[] args) {
        BankAccount b = new BankAccount(1000, 20);
        b.display();
        b.setaccountNumber(1234);
        b.setbalance(100);
        b.deposit(10);
        b.withdrawl(10);
        

    }
}

