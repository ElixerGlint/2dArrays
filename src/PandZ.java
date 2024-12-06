import java.util.Arrays;

public class PandZ {
    private char[][] board;
    private int starrow;
    private int starcol;

    public PandZ() {
        board = new char[5][8];
        for (int row = 0; row < board.length; row++) {
            board[row][0] = 'P';
            board[row][board[row].length - 1] = 'Z';

        }
        for (int row = 0; row < board.length; row++) {
            for (int col = 1; col < board[row].length - 1; col++) {
                board[row][col] = ' ';
            }
        }
        starrow = (int)(Math.random()*board.length);
        starrow = 1;
    }


    public boolean marchzombies() {
        for(int i = 0; i < board.length; i++) { //all the rows
            if(!marchzombie(i)) {
                return false;
            }

        }
        return true;
    }


    public boolean marchzombie(int row) {
        for (int col = board[row].length - 1; col > -1; col--) {
            if (board[row][col] == 'Z') {
                if (Math.random() < 0.5) {// 50, 50 chance to move
                    if(col-1>= 0) {
                        board[row][col-1] = 'Z';
                        board[row][col] = ' ';
                        return true;
                    }
                    else{
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override
    public String toString() {
        String output = "";

        for (char[] row : board) {
            for (char square : row) {
                output += square + "|";
            }
            output += "\n";
            for (int i = 0; i < row.length * 2; i++) {
                output += "-";
            }
            output += "\n";
        }
        return output;
    }

    // int count
    // int[] abc = new int [3

}