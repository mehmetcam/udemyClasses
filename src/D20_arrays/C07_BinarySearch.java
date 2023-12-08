package D20_arrays;

import D19_ARRAYS.C04_KullanimadediniBUlma;

import java.util.Arrays;

public class C07_BinarySearch {

    public static void main(String[] args) {

        String[] harfler={"a","c","r","s","a","a","s","k","a"};

        // Verilen harfler array'inde "k" harfinin olup olmadigini yazdirin

        C04_KullanimadediniBUlma.elemanArama(harfler, "k");

        // Istenen eleman k 1 kere kullanilmis

        C04_KullanimadediniBUlma.elemanArama(harfler, "A");

        int[] arr = {2,5,6,4,8,74,56,1,3,41,6,9,47,5,4};

        Arrays.sort(arr);

        System.out.println(Arrays.binarySearch(arr, 2));

        int arr3[] = {12, 23, 12, 2, 3};

        Arrays.sort(arr3);

        System.out.println(Arrays.binarySearch(arr3, 5));


    }
}
