import java.util.*;

public class Studentgrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your subjects marks: ");
        {
            System.out.println("enter physics marks: ");
            int physics = sc.nextInt();
            System.out.println("enter chemistry marks: ");
            int chemistry = sc.nextInt();
            System.out.println("enter math marks: ");
            int math = sc.nextInt();
            System.out.println("enter hindi marks: ");
            int hindi = sc.nextInt();
            System.out.println("enter english marks: ");
            int english = sc.nextInt();

            int total = physics + chemistry + math + hindi + english;
            int percentage = total / 5;

            if (percentage >= 90) {
                System.out.println("wonderful, you got a Grade A");
            } else if (percentage >= 80 && percentage < 90) {
                System.out.println("Excellent, you got a Grade B");
            } else if (percentage >= 70 && percentage < 80) {
                System.out.println("Good, you got a Grade C");
            } else if (percentage >= 60 && percentage < 70) {
                System.out.println("Good, you got a Grade D");
            } else if (percentage >= 50 && percentage < 60) {
                System.out.println("Need to work hard, You got a grade E");
            } else {
                System.out.println("You are Failed");
            }

        }
    }

}
