import java.util.Arrays;

public class PandZ {
    private char[][] board;

    public PandZ() {
        board = new char[5][8];
        for (int row = 0; row < board.length; row++) {
            board[row][0] = 'P';
            board[row][board[row].length - 1] = 'Z';
        }
    }

    @Override
    public String toString() {
        String output = "";
        
        for(char[]row:board) {
            for(char square: row) {
                output+= square + "|";
            }
            output += "\n";
            for(int i = 0; i < row.length*2; i++) {
                output+="-";
            }
            output += "\n";
        }




        return output;
    }



    public static int[] addup(int[][] data) {
        int[] output = new int[data.length];

        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                output[i] += data[i][j];
            }
        }
        return output;
    }
    
    //int count
    //int[] abc = new int [3
    
    
    
}