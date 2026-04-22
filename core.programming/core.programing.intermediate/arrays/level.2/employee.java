
import java.util.*;

public class employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] emp = new double[10][2];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary and years of service for employee " + (i + 1));
            emp[i][0] = sc.nextDouble();
            emp[i][1] = sc.nextDouble();
            if (emp[i][0] < 0 || emp[i][1] < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (emp[i][1] > 5) {
                bonus[i] = emp[i][0] * 0.05;
            } else {
                bonus[i] = emp[i][0] * 0.02;
            }
            newSalary[i] = emp[i][0] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += emp[i][0];
            totalNewSalary += newSalary[i];
        }
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);
    }

}
