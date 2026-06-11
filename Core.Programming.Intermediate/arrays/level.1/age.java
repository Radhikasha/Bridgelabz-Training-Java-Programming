import java.util.*;

public class age {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age[] = new int[10];
        for (int i = 0; i < 10; i++) {
            age[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (canStudentVote(age[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

    }

    public static boolean canStudentVote(int age) {
        return age >= 18;
    }

}
