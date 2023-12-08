package Ders25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_ArrayiListE_Cevirme {
    public static void main(String[] args) {
        Integer[] arr = {3,5,6,8,9,7,8,9,4,6,5,4,9,4,1,2,3,5,4,7,8,5,6,9};

        // bu array'i bir list olarak kaydedin

        List<Integer> forList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            forList.add(arr[i]);

        }

        System.out.println(forList); // [3, 5, 6, 8, 9, 7, 8, 9, 4, 6, 5, 4, 9, 4, 1, 2, 3, 5, 4, 7, 8, 5, 6, 9]

        /*
        Arrays class'i bize verilen array'i list'e ceviren hazir bir method sunuyor

        ANCAAAAAAAAAK

        bu method'u kullanarak bir array'i list'e cevirmenin iki buyuk dezavantaji var
        1- add() ve remove() gibi list'in uzunlugunu degistiren methodlari desteklemez
        2- her ne akdar biz bir list degistirmis olsak da JAVA arka planda hazir method ile olusturulan list ve kaynak arr'yi ilisiklendirir
            birinde yapilan degisiklik digerine de eklenir


         */


        List<Integer> hazirMethodList = Arrays.asList(arr);
        System.out.println(hazirMethodList); // [3, 5, 6, 8, 9, 7, 8, 9, 4, 6, 5, 4, 9, 4, 1, 2, 3, 5, 4, 7, 8, 5, 6, 9]

        forList.remove(3);
        System.out.println(forList); // [3, 5, 6, 9, 7, 8, 9, 4, 6, 5, 4, 9, 4, 1, 2, 3, 5, 4, 7, 8, 5, 6, 9]

        //hazirMethodList.remove(3);
        //System.out.println(hazirMethodList); // UnsupportedOperationException

        forList.set(0,10);
        System.out.println(forList); // [10, 5, 6, 9, 7, 8, 9, 4, 6, 5, 4, 9, 4, 1, 2, 3, 5, 4, 7, 8, 5, 6, 9]
        System.out.println(Arrays.toString(arr)); // [3, 5, 6, 8, 9, 7, 8, 9, 4, 6, 5, 4, 9, 4, 1, 2, 3, 5, 4, 7, 8, 5, 6, 9]

        hazirMethodList.set(0,20);
        System.out.println(hazirMethodList); // [20, 5, 6, 8, 9, 7, 8, 9, 4, 6, 5, 4, 9, 4, 1, 2, 3, 5, 4, 7, 8, 5, 6, 9]
        System.out.println(Arrays.toString(arr)); // [20, 5, 6, 8, 9, 7, 8, 9, 4, 6, 5, 4, 9, 4, 1, 2, 3, 5, 4, 7, 8, 5, 6, 9]
    }
}
