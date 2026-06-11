public class Volume {
    public static void main(String[] args) {
        double volume_of_sphere = (4.0 / 3.0) * 3.14 * 6378 * 6378 * 6378;

        double miles = volume_of_sphere * 0.621371 * 0.621371 * 0.621371;
        System.out.println(
                "The volume of earth in cubic kilometers is " + volume_of_sphere + "and cubic miles is " + miles);

    }
}
