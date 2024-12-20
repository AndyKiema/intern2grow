import java.io.*;
import java.util.Scanner;

public class TicTacToe {
    static char[][] board = new char[3][3];
    static final String WINS_FILE = "userWins.txt"; 
    static int userWins = 0; 
    public static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public static void clearBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
    }

    public static boolean checkWin(char currentPlayer) {

        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) ||
                (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer)) {
                return true;
            }
        }

        return (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) ||
               (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer);
    }

    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isMoveValid(int row, int column) {
        return row >= 0 && row < 3 && column >= 0 && column < 3 && board[row][column] == ' ';
    }

    public static void saveWinsToFile(int wins) {
        try (FileWriter writer = new FileWriter(WINS_FILE)) {
            writer.write(String.valueOf(wins));
        } catch (IOException e) {
            System.out.println("An error occurred while saving wins.");
        }
    }

    public static int loadWinsFromFile() {
        try (Scanner sc = new Scanner(new File(WINS_FILE))) {
            if (sc.hasNextInt()) {
                return sc.nextInt();
            }
        } catch (FileNotFoundException e) {
            System.out.println("No previous wins found. Starting fresh.");
        }
        return 0; 
    }

    public static void main(String[] args) {
        userWins = loadWinsFromFile();
        boolean gameIsOn = true;
        char currentPlayer = 'X';

        clearBoard(); 

        while (gameIsOn) {
            printBoard();
            System.out.println("Player " + currentPlayer + ", it's your turn!");

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter row (from 0-2):");
            int row = sc.nextInt();
            System.out.println("Enter column (from 0-2):");
            int column = sc.nextInt();

            if (isMoveValid(row, column)) {
                board[row][column] = currentPlayer;
                if (checkWin(currentPlayer)) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    printBoard();
                    if (currentPlayer == 'X') {
                        userWins++;
                        saveWinsToFile(userWins); 
                    }
                    gameIsOn = false;
                } else if (isBoardFull()) {
                    System.out.println("It's a draw. Nobody wins!");
                    printBoard();
                    gameIsOn = false;
                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }
            } else {
                System.out.println("Invalid move! Try again, please.");
            }
        }

        System.out.println("Player X has " + userWins + " total wins!");
    }
}

