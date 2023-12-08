package D21_Arrays_ve_multiDimensional_Arrays;

import java.util.Arrays;

public class C07_MDA_SartliUpdate {
    public static void main(String[] args) {

        // verilen iki katli bir array'de pozitif sayilarin degerini
        // 3 azaltip negatif sayilarin degerini 4 arttirin

        int[][] arr = {{4,-1,-5},{6,-9,2},{1,5,-8,-4,3,6}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] <0){
                    arr[i][j] += 4;
                } else if (arr[i][j]>0) {
                    arr[i][j] -=3;
                }
            }
        }

        System.out.println(Arrays.deepToString(arr)); //


    }
}
