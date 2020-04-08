import java.util.*;

public class TicTacToe {



    static String[][] board = new String[3][3];
    static int player = 0;



    public TicTacToe() {

    }





    public static void main(String args[]) {
        TicTacToe tictactoe = new TicTacToe();

        Scanner scanner = new Scanner(System.in);





        while(true) {
            System.out.println("enter column and row in board");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (player % 2 == 0) {
                board[row][col] = "X";
            } else {
                board[row][col] = "O";
            }



            printBoard();

            player++;
        }





    }




    static void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == null) {
                    System.out.print(".");
                } else {
                    System.out.print(board[i][j]);
                }
            }
            System.out.println();
        }
    }



}

