import java.util.*;

public class tictactoe {

    static char[] board = { ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ' };

    public static void printBoard() {
        System.out.println();
        System.out.println(" " + board[0] + " | " + board[1] + " | " + board[2]);
        System.out.println("---|---|---");
        System.out.println(" " + board[3] + " | " + board[4] + " | " + board[5]);
        System.out.println("---|---|---");
        System.out.println(" " + board[6] + " | " + board[7] + " | " + board[8]);
        System.out.println();
    }

    public static boolean checkWinner(char player) {
        int[][] winPos = {
                { 0, 1, 2 }, { 3, 4, 5 }, { 6, 7, 8 }, // rows
                { 0, 3, 6 }, { 1, 4, 7 }, { 2, 5, 8 }, // cols
                { 0, 4, 8 }, { 2, 4, 6 } // diagonals
        };

        for (int[] pos : winPos) {
            if (board[pos[0]] == player &&
                    board[pos[1]] == player &&
                    board[pos[2]] == player) {
                return true;
            }
        }
        return false;
    }

    public static boolean isBoardFull() {
        for (char c : board) {
            if (c == ' ')
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char currentPlayer = 'X';

        System.out.println("🎮 Tic Tac Toe Game");
        printBoard();

        while (true) {
            System.out.print("Player " + currentPlayer + ", enter position (1-9): ");
            int pos = sc.nextInt() - 1;

            if (pos < 0 || pos > 8 || board[pos] != ' ') {
                System.out.println("Invalid move! Try again.");
                continue;
            }

            board[pos] = currentPlayer;
            printBoard();

            if (checkWinner(currentPlayer)) {
                System.out.println("🏆 Player " + currentPlayer + " wins!");
                break;
            }

            if (isBoardFull()) {
                System.out.println("🤝 It's a draw!");
                break;
            }

            // Switch player
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
        }

        sc.close();
    }
}