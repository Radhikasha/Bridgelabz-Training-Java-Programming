
import java.util.*;

public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = sc.nextInt();
        double[][] marks = new double[n][3];
        double[] percentages = new double[n];
        String[] grades = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + " in physics, chemistry, and maths:");
            marks[i][0] = sc.nextDouble();
            marks[i][1] = sc.nextDouble();
            marks[i][2] = sc.nextDouble();
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
            if (percentages[i] >= 90) {
                grades[i] = "A";
            } else if (percentages[i] >= 80) {
                grades[i] = "B";
            } else if (percentages[i] >= 70) {
                grades[i] = "C";
            } else if (percentages[i] >= 60) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }

        System.out.println("Marks\t\tPercentage\tGrade");
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t"
                    + String.format("%.2f", percentages[i]) + "\t" + grades[i]);
        }
    }

}
