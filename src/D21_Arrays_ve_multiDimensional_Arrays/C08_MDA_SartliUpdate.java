package D21_Arrays_ve_multiDimensional_Arrays;

import java.util.Arrays;

public class C08_MDA_SartliUpdate {

    public static void main(String[] args) {
        // verilen 2 katli MDA'de
        // elementleri icinde bulundugu inner array'deki indexi kadar arttirin

        int[][] arr = {{4,-1,-5},{6,-9,2},{1,5,-8,-4,3,6}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] += j;
            }
        }

        System.out.println(Arrays.deepToString(arr)); // [[4, 0, -3], [6, -8, 4], [1, 6, -6, -1, 7, 11]]
    }
}
