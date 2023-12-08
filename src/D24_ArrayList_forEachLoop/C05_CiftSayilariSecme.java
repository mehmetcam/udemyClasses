package D24_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_CiftSayilariSecme {
    public static void main(String[] args) {
        // Verilen int bir array'den
        // cift sayilari alip, ayri bir array olarak kaydedin

        int[] arr = {3,5,1,7,9,0,4,2,6,7,8,1,5,8,7,6};

        /* Istenen elementleri bir array olarak istedigi icin
        iki sekilde yapabiliriz

        1- Once kac tane cift sayi oldugunu bulur,
           sayiya gore bir array olusturup
           cift sayilari olusturan yeni array'e kopyalariz

        2- array'deki tum elementleri gozden gecirip
           cift olanlari bir listeye atariz
           Listenin uzunluguna gore yeni array olusturup
           Listedeki elementleri yeni array'e atariz

            ***2. yontemi yapalim


         */


        List<Integer> ciftSayilarListesi = new ArrayList<>();

        for (Integer each: arr
             ) {
            if (each %2==0){
                ciftSayilarListesi.add(each);
            }

        }

         // [0, 4, 2, 6, 8, 8, 6]

        int[] ciftSayilarArrayi = new int[ciftSayilarListesi.size()];
        /*

        MANTIKLI OLAN YONTEM FOR LOOP ILE ELEMENTLERI ciftSayilarArray'ine kopyalamaktir

        for (int i = 0; i < ciftSayilarArrayi.length; i++) {
            ciftSayilarArrayi[i] = ciftSayilarListesi.get(i);
        }

        System.out.println("Cift sayilar array'i: " + Arrays.toString(ciftSayilarArrayi));
        // Cift sayilar array'i: [0, 4, 2, 6, 8, 8, 6]
        */

        // for-each loop ile yapmak istersek

        int index = 0;
        for (int each: ciftSayilarListesi
             ) {
            ciftSayilarArrayi[index] = ciftSayilarListesi.get(index);
            index++;
            
        }

        System.out.println("Cift sayilar array'i: " + Arrays.toString(ciftSayilarArrayi));
        // Cift sayilar array'i: [0, 4, 2, 6, 8, 8, 6]

    }
}
