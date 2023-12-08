package D21_Arrays_ve_multiDimensional_Arrays;

import java.util.Arrays;

public class C06_TumElementleriArttirma {
    public static void main(String[] args) {
        // verilen iki katli bir int[] deki
        // tum sayilari 3 artirin

        int[][] arrIki = {{3,4,6},{9,0},{2,5,6,8,1}};
        int toplam = 0;

        for (int i = 0; i < arrIki.length; i++) {
            for (int j = 0; j < arrIki[i].length; j++) {

                    arrIki[i][j] +=3;

            }
        }

        System.out.println(Arrays.deepToString(arrIki)); // [[6, 7, 9], [12, 3], [5, 8, 9, 11, 4]]
    }
}
