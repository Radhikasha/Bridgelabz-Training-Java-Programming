public class BankAccount {
    static String bankName = "CANARA Bank";
     String accountHolderName;
     final int accountNumber;
     static int totalAccount;

     BankAccount(int accountNumber) {
        this.bankName = bankName;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccount++;

    }
    void display(){
        System.out.println("Bank Name: "+bankName);
        System.out.println("Account Holder Name: "+accountHolderName);
        System.out.println("Account Number: "+accountNumber);
    }

     





    static void  getTotalAccounts(){
        System.out.println("Total Account are: "+totalAccount);

    }
    
}
class bank{
    public static void main(String[] args) {
        BankAccount b = new BankAccount(123456754);
        BankAccount b1 = new BankAccount(213445677);

        b.accountHolderName = "radhika";
       
         b1.accountHolderName = "Muni";
        
         b1.bankName = "SBI";
 if (b instanceof BankAccount) {
            b.display();
        }
         
         if (b1 instanceof BankAccount) {
            b1.display();
        }
         

         BankAccount.getTotalAccounts();
    }
}
