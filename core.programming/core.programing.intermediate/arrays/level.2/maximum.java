
/*Create a program to find the youngest friends among 3 Amar, Akbar, and Anthony based on
their ages and the tallest among the friends based on their heights
Hint =>
a. Take user input for age and height for the 3 friends and store it in two arrays each to
store the values for age and height of the 3 friends
b. Loop through the array and find the youngest of the 3 friends and the tallest of the 3
friends
c. Finally display the youngest and tallest of the 3 friends */
import java.util.*;

public class maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] ages = new double[3];
        double[] heights = new double[3];
        String[] names = { "Amar", "Akbar", "Anthony" };

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter age and height for " + names[i]);
            ages[i] = sc.nextDouble();
            heights[i] = sc.nextDouble();
        }

        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        System.out.println("The youngest friend is " + names[youngestIndex]);
        System.out.println("The tallest friend is " + names[tallestIndex]);
    }
}
