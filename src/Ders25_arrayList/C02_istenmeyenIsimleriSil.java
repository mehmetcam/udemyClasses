package Ders25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_istenmeyenIsimleriSil {
    public static void main(String[] args) {
        /*
        Verilen String bir listede
        istenmeyen harf iceren elementleri silip
        Kalan kismini list olarak bize donduren bir method olusturun
         */

        String[] arr = {"Mehmet", "Ramazan", "Ozan", "Berk","Nergiz", "Ayfer", "Bugra"};
        List<String> isimler = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            isimler.add(arr[i]);

        }

        System.out.println("Isimler listesi: " + isimler);

        System.out.println(istenmeyenleriSil(isimler, "a"));

        // isimler listesinin kalici olarak yeni hali almasini istersek

        isimler = istenmeyenleriSil(isimler, "a");



    }


    public static List<String> istenmeyenleriSil(List<String> isimler, String istenmeyenHarf){
        /*
        isim sildigimizde index kayacaktir
        bu da bazi elementlerin kontrol edilmemesine
        ve indexOutofBound hatasina sebep olabilir

        Verilen listeden isim silmek yerine
        baska bos bir liste olusturalim
        ve SILINMEYECEK elemanlari o listeye ekleyip
        yeni listeyi dondurelim
         */

        List<String> yeniList = new ArrayList<>();

        for (int i = 0; i < isimler.size(); i++) {
            if (!isimler.get(i).contains(istenmeyenHarf)){

                yeniList.add(isimler.get(i));
            }


        }

        return yeniList;

    }
}
