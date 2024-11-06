
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] board = new char[3][3];

        // Initialise the empty board
        for (char[] board1 : board) {
            for (int col = 0; col < board1.length; col++) {
                board1[col] = ' ';
            }
        }

        char player = 'X';
        boolean gameOver = false;

        System.out.println("Welcome to Tic Tac Toe! Let's start a new game.");

        // Check if the game is not over
        while (!gameOver) {
            printBoard(board);
            // Take player input
            System.out.print("Player " + player + " enter your move: ");
            int r = sc.nextInt();
            int c = sc.nextInt();

            // Check if the place is not already filled
            if (r < 3 && c < 3 && board[r][c] == ' ') {
                board[r][c] = player; // place the element

                gameOver = haveWon(board, player);

                // Check if any player won after every move
                if (gameOver) {
                    System.out.println("Player " + player + " has won!");
                } else {
                    boolean isTie = true;
                    for (char[] board1 : board) {
                        for (int col = 0; col < board1.length; col++) {
                            if (board1[col] == ' ') {
                                isTie = false;
                            }
                        }
                    }

                    if (isTie) {
                        System.out.println("This game was a tie!");
                        gameOver = true;
                    } else {
                        player = player == 'X' ? 'O' : 'X';
                    }

                }
            } else {
                System.out.println("Invalid move! Try again.");
            }

        }
        printBoard(board);
    }

    static void printBoard(char[][] board) {
        for (int row = 0; row < board.length; row++) {
            System.out.print("|");
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + "|");
            }
            System.out.println();
        }
    }

    static boolean haveWon(char[][] board, char player) {
        // Check for row
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] == player && board[row][1] == player && board[row][2] == player) {
                return true;
            }
        }

        // Check for column
        for (int col = 0; col < board[0].length; col++) {
            if (board[0][col] == player && board[1][col] == player && board[2][col] == player) {
                return true;
            }
        }

        // Check for diagonal
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
}
