package Ders21;

import java.util.Arrays;

public class soru1 {

    public static void main(String[] args) {
        // Bir array'in butun elementlerinin degerlerini 2 arttiran bir method olusturun. Eski array'i yeni haliyle kaydedin


        int[] arr = {3,4,6,8,1};

       arr =  arrayElementlerini2Arttir(arr);

        System.out.println(Arrays.toString(arr));

    }

    //Method olustur MAIN IN DISINDA YAP MK

    public static int[] arrayElementlerini2Arttir(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            arr[i] += 2;

        }

        return arr;

    }

}
