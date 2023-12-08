package PROJECTS.Day05;

import java.util.Arrays;

public class P01_Arraydeki_Sayilarin_Toplami {
    public static void main(String[] args) {
        //Create an array of 5 floats and calculate their sum.

        /*

        float[] numbers = new float[5];

        numbers[0] = 1.1f;
        numbers[1] = 2.2f;
        numbers[2] = 3.3f;
        numbers[3] = 4.4f;
        numbers[4] = 5.5f;

        System.out.println(Arrays.toString(numbers));
        */

        float[] numbers = {1.1f, 2.2f, 3.3f, 4.4f, 5.5f};
        float sum = 0;
        for (int i = 0; i < numbers.length; i++) {

            sum += numbers[i];

        }

        System.out.println(sum); // 16.5


        System.out.println("***************** FOR LOOP COZUMU *****************");
        sum =0;

        int i =0;

        while (i< numbers.length){

            sum += numbers[i];
            i++;
        }

        System.out.println(sum); // 16.5

        System.out.println("***************** FOR LOOP COZUMU 2 *****************");

        sum = 0;
        int ind = numbers.length-1;

        while (ind >= 0){

            sum += numbers[ind];
            ind--;

        }

        System.out.println(sum); // 16.5


        
    }
}
