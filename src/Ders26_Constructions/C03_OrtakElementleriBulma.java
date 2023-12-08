package Ders26_Constructions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C03_OrtakElementleriBulma {
    public static void main(String[] args) {
        /*
        Soru 5 - Verilen iki array'in elementlerini karsilastirip,
        ikisinde ortak olan elementleri ayri bir liste olarak veren
        bir program yazdirin
         */

        Integer[] arr1 = {3,5,8,1,3,9,2,4,7,1};
        Integer[] arr2 = {2,7,3,5,8,1,9,0,3,5,7};

        // iki array'in elementlerini bana getirmesi icin iç içe iki for each loop olusturalim
        // elementleri karsilastirip, eger esitlerse ve daha once listeye eklenmemisse
        // Listeye ekleyelim

        List<Integer> ortakElemenlarListesi = new ArrayList<>();

        for (Integer each1 : arr1
             ) {

            for (Integer each2 : arr2
                 ) {

                if (each1 == each2 && !ortakElemenlarListesi.contains(each1)){
                    ortakElemenlarListesi.add(each1);
                }

            }

        }

        Collections.sort(ortakElemenlarListesi);
        System.out.println(ortakElemenlarListesi);

    }
}
