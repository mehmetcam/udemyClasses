package Ders21;

import java.lang.reflect.Array;
import java.util.Arrays;

public class soru2 {

    public static void main(String[] args) {

        int[] arr = {3,5,2};
        int artis = 4;

        //verilen array'in tum elementlerini
        //artis miktari kadar artirin

        for (int i = 0; i < arr.length; i++) {

            arr[i] += artis;


        }

        System.out.println(Arrays.toString(arr));


        int[] sayilar = {5,8,2};
       // int artis = 4;
        System.out.println(Arrays.toString(elementleriArttir(sayilar , artis)));


    }


    public static int[] elementleriArttir (int[] arr , int artis){
        for (int i = 0; i < arr.length; i++) {

            arr[i] += artis;

        }

        return arr;
    }

}
