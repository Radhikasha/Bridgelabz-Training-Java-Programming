import java.util.*;

public class Distance_in_feet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance_in_feet = sc.nextDouble();

        double distance_in_yards = distance_in_feet / 3;
        double distance_in_miles = distance_in_yards / 1760;
        System.out.println(" Your Height in cm is " + distance_in_feet + " while in feet is " + distance_in_feet
                + " and yards is " + distance_in_yards);
    }

}
