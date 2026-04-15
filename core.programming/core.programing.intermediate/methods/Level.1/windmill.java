import java.util.*;

public class windmill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temperature = sc.nextInt();
        int windspeed = sc.nextInt();
        wind(temperature, windspeed);
    }

    public static void wind(int temperature, int windspeed) {
        double windchill = 35.74 + (0.6215 * temperature) - (35.75 * Math.pow(windspeed, 0.16))
                + (0.4275 * temperature * Math.pow(windspeed, 0.16));
        System.out.println(windchill);
    }

}
