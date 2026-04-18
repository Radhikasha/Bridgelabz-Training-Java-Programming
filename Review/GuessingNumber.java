import java.util.Random;
import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        String playAgain = "";

        do {
            int attempts = 0;
            int number = random.nextInt(100) + 1;
            System.out.println("Guess a number between 1 and 100:");
            while (true) {
                int guess = sc.nextInt();
                attempts++;
                if (guess < number) {
                    System.out.println("Too low, Try again:");
                } else if (guess > number) {
                    System.out.println("Too high, Try again:");
                } else {
                    System.out.println("Congrats, You've guessed the number in " + attempts + " attempts.");

                    break;
                }
                if (attempts == 10) {
                    System.out.println("Sorry, you didn't guess the number. The number was " + number);
                    break;
                }
            }

            System.out.println("Do you want to play again? (yes/no)");
            playAgain = sc.next();
        } while (playAgain.equals("yes"));

        System.out.println("Thank you for playing");
    }
}