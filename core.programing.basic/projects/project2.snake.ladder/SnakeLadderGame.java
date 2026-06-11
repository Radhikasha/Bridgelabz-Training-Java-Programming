import java.util.*;

public class SnakeLadderGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Snakes and Ladders
        Map<Integer, Integer> snakes = new HashMap<>();
        Map<Integer, Integer> ladders = new HashMap<>();

        // Initialize snakes
        snakes.put(99, 54);
        snakes.put(70, 55);
        snakes.put(52, 42);
        snakes.put(25, 2);

        // Initialize ladders
        ladders.put(6, 25);
        ladders.put(11, 40);
        ladders.put(60, 85);
        ladders.put(46, 90);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] players = new String[n];
        int[] positions = new int[n];

        // Input player names
        for (int i = 0; i < n; i++) {
            System.out.print("Enter player name: ");
            players[i] = sc.nextLine();
            positions[i] = 0;
        }

        boolean gameOver = false;

        while (!gameOver) {
            for (int i = 0; i < n; i++) {
                System.out.println("\n" + players[i] + "'s turn");

                int dice = rand.nextInt(6) + 1;
                System.out.println("🎲 Rolled: " + dice);

                int newPos = positions[i] + dice;

                if (newPos <= 100) {

                    // Check snake
                    if (snakes.containsKey(newPos)) {
                        System.out.println("🐍 Snake! Down to " + snakes.get(newPos));
                        newPos = snakes.get(newPos);
                    }

                    // Check ladder
                    else if (ladders.containsKey(newPos)) {
                        System.out.println("🪜 Ladder! Up to " + ladders.get(newPos));
                        newPos = ladders.get(newPos);
                    }

                    positions[i] = newPos;
                } else {
                    System.out.println("Move exceeds 100, stay at " + positions[i]);
                }

                System.out.println(players[i] + " is at position " + positions[i]);

                if (positions[i] == 100) {
                    System.out.println("🏆 " + players[i] + " wins the game!");
                    gameOver = true;
                    break;
                }
            }
        }

        sc.close();
    }
}