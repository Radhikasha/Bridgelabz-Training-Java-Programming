import java.util.*;

public class Distance_km {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double distance_in_km = sc.nextDouble();
        double distance_in_miles = distance_in_km * 0.621371;
        System.out.println("The distance " + distance_in_km + " km in miles is: " + distance_in_miles);
    }

}
