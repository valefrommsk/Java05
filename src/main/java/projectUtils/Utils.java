package projectUtils;

import java.util.Arrays;

public class Utils {

    public static void random2DArray(int indexA, int indexB, int start, int end) {
        int[][] randomArrays = new int[indexA][indexB];
        int range = (end + 1 - start);

        for (int i = 0; i <= indexA - 1; i++) {
            for (int j = 0; j <= indexB - 1; j++) {

                randomArrays[i][j] = (int) (Math.random() * range) + start;
            }
        }
        for (int i = 0; i <= indexA - 1; i++) {
            System.out.println(Arrays.toString(randomArrays[i]));
        }


    }

}
