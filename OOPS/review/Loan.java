package  review;
abstract class Loan {
    private int loanId;
    private String applicantName;
    protected double principal;

    public Loan(int loanId, String applicantName, double principal) {
        this.loanId = loanId;
        this.applicantName = applicantName;
        this.principal = principal;
    }

    abstract double calculateEMI(int months);

    void displayLoanInfo() {
        System.out.println("Loan ID: " + loanId);
        System.out.println("Name: " + applicantName);
        System.out.println("Principal: " + principal);
    }
}


interface Eligible {
    boolean checkEligibility(double income);
}

interface Foreclosable {
    void foreclose(int remainingMonths);
}


class HomeLoan extends Loan implements Eligible, Foreclosable {

    public HomeLoan(int id, String name, double principal) {
        super(id, name, principal);
    }

    public double calculateEMI(int months) {
        double rate = 0.07;
        return (principal + principal * rate) / months;
    }

    public boolean checkEligibility(double income) {
        return income > 30000;
    }

    
    public void foreclose() {
        System.out.println("Home Loan: Foreclosed with 2% penalty");
    }

    public void foreclose(int months) {
        System.out.println("Home Loan: Foreclosed after " + months + " months");
    }

    public void foreclose(int months, String reason) {
        System.out.println("Home Loan: Foreclosed due to " + reason);
    }
}


class CarLoan extends Loan implements Eligible, Foreclosable {

    public CarLoan(int id, String name, double principal) {
        super(id, name, principal);
    }

    public double calculateEMI(int months) {
        double rate = 0.09;
        return (principal + principal * rate) / months;
    }

    public boolean checkEligibility(double income) {
        return income > 20000;
    }

    public void foreclose(int remainingMonths) {
        System.out.println("Car Loan: Foreclosed");
    }
}


class PersonalLoan extends Loan implements Eligible, Foreclosable {

    public PersonalLoan(int id, String name, double principal) {
        super(id, name, principal);
    }

    public double calculateEMI(int months) {
        double rate = 0.12;
        return (principal + principal * rate) / months;
    }

    public boolean checkEligibility(double income) {
        return income > 15000;
    }

    public void foreclose(int remainingMonths) {
        System.out.println("Personal Loan: Foreclosed");
    }
}


class run3 {
    public static void main(String[] args) {

        Loan l1 = new HomeLoan(1, "Radhika", 500000);
        Loan l2 = new CarLoan(2, "Aman", 300000);
        Loan l3 = new PersonalLoan(3, "Neha", 100000);

        Loan[] loans = {l1, l2, l3};

        for (Loan l : loans) {
            l.displayLoanInfo();
            System.out.println("EMI: " + l.calculateEMI(12));
            
        }
    }
}