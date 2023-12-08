package Ders22;

import java.util.Arrays;

public class C05_varOlanArrayeYeniDegerAtamak {
    public static void main(String[] args) {
        /*
        Var olan bir array'a length olarak belirlenenden daha fazla element atanabilir mi ?

        ANCAK
        var olan bir array'e
        baska bir array'i deger olarak ATAYABILIRIZ
         */

        int[] arr = {3,4,5,6,8,1};
        System.out.println(arr.length); //6

        // 7. elementi bu array'a atayabilir miyiz ?

        // arr[6] = 13;

        arr = new int[8];

        System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 0, 0, 0, 0]
        // Eski elemanlar sizlere omur... :(

        String[] harfler = {"a" , "b" , "y"};

        String[] yeniHarfler= {"k" , "l" , "m"};
    }
}

