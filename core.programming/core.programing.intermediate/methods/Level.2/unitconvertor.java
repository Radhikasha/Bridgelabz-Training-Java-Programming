import java.util.*;

public class unitconvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km = sc.nextDouble();
        double miles = sc.nextDouble();
        double feet = sc.nextDouble();
        double meters = sc.nextDouble();
        kmtomiles(km);
        milestokm(miles);
        feettometers(feet);
        meterstofeet(meters);
    }

    public static double kmtomiles(double km) {
        double miles = km * 0.621371;
        System.out.println(km + " km is equal to " + miles + " miles.");
        return miles;
    }

    public static double milestokm(double miles) {
        double km = miles / 0.621371;
        System.out.println(miles + " miles is equal to " + km + " km.");
        return km;
    }

    public static double feettometers(double feet) {
        double meters = feet * 0.3048;
        System.out.println(feet + " feet is equal to " + meters + " meters.");
        return meters;
    }

    public static double meterstofeet(double meters) {
        double feet = meters / 0.3048;
        System.out.println(meters + " meters is equal to " + feet + " feet.");
        return feet;
    }

}
