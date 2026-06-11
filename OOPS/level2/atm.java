public class atm {
    String accountHolder;
    long accountNumber;
    int balance;

    atm(){
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    int depositing(int d){
        if(d > 0){
            balance += d;

        }
        return balance;


    }
    int withdraw(int w){
        if(balance > 0){
            balance -= w;
        }
        return balance;

    }
    void display(){
        System.out.println("after depositing: "+ depositing(4500));
        System.out.println("after withdrawl: "+ withdraw(450) );
        System.out.println("total Balance: "+balance);

    }
    
}
class BankBalance{
    public static void main(String[] args) {
        atm a = new atm();
        a.accountHolder = "Radhika";
        a.accountNumber = 2563748457L;
        a.balance = 67000;
        a.display();

    }
}
