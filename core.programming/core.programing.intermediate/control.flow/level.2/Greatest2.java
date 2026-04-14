import java.util.*;

public class Greatest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = n - 1;
        int greatestfactor = 1;
        while (counter >= 1) {
            if (n % counter == 0) {
                greatestfactor = counter;
                break;
            }
            counter--;
        }
        System.out.println("Greatest factor of " + n + " is: " + greatestfactor);
    }

}
