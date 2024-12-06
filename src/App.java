import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[][] arr2d = new int[3][4];
        for(int i = 0; i < arr2d.length; i++) {
            for(int j = 0; j < arr2d[i].length; j++) {
                arr2d[i][j] = (int) (Math.random()*20);
            }
        }
        System.out.println(Arrays.toString(arr2d));
        System.out.println(Arrays.deepToString(arr2d));
        System.out.println(Arrays.toString(sumrows(arr2d)));
        System.out.println(Arrays.toString(sumcollums(arr2d)));




        PandZ abc = new PandZ();

        while(abc.marchzombies()) {
            abc.startshoot();
            System.out.println(abc);
            Thread.sleep(500);
            
        }
        System.out.println("You Lose!");

        


    }




    public static int[] sumrows(int[][] data) {
        int[] output = new int[data.length];
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                output[i] += data[i][j];
            }
        }
        return output;
    }

    public static int[] sumcollums(int[][] data) {
        int[] output = new int[data[0].length];
        for(int i = 0; i < data[0].length; i++) { //collums
            for(int j = 0; j < data.length; j++) { //rows
                output[i] += data[j][i];
            }
        }
        return output;
    }
}
