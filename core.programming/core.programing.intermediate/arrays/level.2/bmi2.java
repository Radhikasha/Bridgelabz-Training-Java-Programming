
/*Rewrite the above program using multi-dimensional array to store height, weight, and BMI in
2D array for all the persons
Hint =>
a. Take input for a number of persons
b. Create a multi-dimensional array to store weight, height and BMI. Also create an to store
the weight status of the persons
double[][] personData = new double[number][3];
String[] weightStatus = new String[number];
c. Take input for weight and height of the persons and for negative values, ask the user to
enter positive values
d. Calculate BMI of all the persons and store them in the personData array and also find
the weight status and put them in the weightStatus array
e. Display the height, weight, BMI and status of each person */
import java.util.*;

public class bmi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of persons:");
        int n = sc.nextInt();
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter weight and height for person " + (i + 1));
            personData[i][0] = sc.nextDouble();
            personData[i][1] = sc.nextDouble();
            if (personData[i][0] <= 0 || personData[i][1] <= 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--;
            }
        }

        for (int i = 0; i < n; i++) {
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]); // BMI
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("Height\tWeight\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println(personData[i][1] + "\t" + personData[i][0] + "\t"
                    + String.format("%.2f", personData[i][2]) + "\t" + weightStatus[i]);
        }
    }
}
