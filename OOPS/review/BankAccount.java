package review;


class BankAccount {
    int accountNo;
    String holderName;
    private double balance;
    static int totalAccounts;

    BankAccount(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
        totalAccounts++;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("After deposit, balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("After withdrawal, balance: " + balance);
        }
    }

    static void getTotalAccount() {
        System.out.println("Total accounts: " + totalAccounts);
    }

    public double getBalance() {
        return balance;
    }
}


class SavingsAccount extends BankAccount {
    int interestRate;

    public SavingsAccount(int accountNo, String holderName, double balance, int interestRate) {
        super(accountNo, holderName, balance);
        this.interestRate = interestRate;
    }

    void displaySavings() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + interestRate);
    }
}

class CurrentAccount extends BankAccount {
    int overdraftLimit;

    public CurrentAccount(int accountNo, String holderName, double balance, int overdraftLimit) {
        super(accountNo, holderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    void displayCurrent() {
        System.out.println("Account No: " + accountNo);
        System.out.println("Holder: " + holderName);
        System.out.println("Balance: " + getBalance());
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}


class run {
    public static void main(String[] args) {

        BankAccount b = new BankAccount(12342233, "Radhika", 50000);

        BankAccount a = new CurrentAccount(25361622, "Aashu", 80000, 10000);
        BankAccount be = new SavingsAccount(12645363, "Krishna", 25000, 5);

    
        if (a instanceof CurrentAccount) {
            ((CurrentAccount) a).displayCurrent();

        }

        if (be instanceof SavingsAccount) {
            ((SavingsAccount) be).displaySavings();
        }

        b.deposit(800);
        b.withdraw(500);

        BankAccount.getTotalAccount();
    }
}