import java.util.*;

public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height_in_cm = sc.nextDouble();
        double height_in_feet = height_in_cm * 0.0328084;
        double height_in_inches = height_in_cm * 0.393701;
        System.out.println("The height " + height_in_cm + " cm in feet is: " + height_in_feet + " and in inches is: "
                + height_in_inches);

    }

}
