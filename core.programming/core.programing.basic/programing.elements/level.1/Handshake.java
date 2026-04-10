import java.util.*;

public class Handshake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number_of_people = sc.nextInt();
        int handshakes = (number_of_people * (number_of_people - 1)) / 2;
        System.out.println("The number of handshakes is: " + handshakes);
    }

}
