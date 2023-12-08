package D24_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C04_ForEachLoop_ile_ListedekiSayilariToplayin {

    public static void main(String[] args) {

        /*
        For-each loop
        birden cok element barindiran yapilar icin kullanilir


        For each loop'un gorevi
        Verdigimiz cok eleman barindiran yapidaki
        TUM ELEMENTLERI bize getirmektir

        Bu islem icin For each loop'a 3 bilgi gereklidir
        1- Bize getirecegi elementlerin DATA TURU
        2- Loop icinde bu elementlere verecegimiz isim (bizim oglanin adi)
        3- bu elementleri nereden alip bize getirecegi

        for-each loop index kullanmadigi icin
        elementleri sirali getirme mecburiyeti yoktur
        genellikle sirali getirir, ama sirali getireceginin garantisi yoktur
        sirali getirecegi varsayilarak islem yapilamaz


         */

        Integer[] arr = {3,5,1,2,6,4,5,1,7,8,4,2,5,6};

        List<Integer> sayilar = new ArrayList<>();

        // Index kullanmadan arr'deki tum elementleri
        // sayilar listesine ekleyin

        for (Integer each: arr
             ) {
            sayilar.add(each);
        }


        for (int i = 0; i < arr.length; i++) {
            sayilar.add(arr[i]);

        }

        System.out.println(sayilar); // [3, 5, 1, 2, 6, 4, 5, 1, 7, 8, 4, 2, 5, 6]

        // index kullanmadan sayilar listesindeki
        // tum elementlerin toplamini yazdirin

        int toplam = 0;

        for (int i = 0; i < sayilar.size(); i++) {
            toplam += sayilar.get(i);
        }

        toplam =0;

        for (Integer each: arr
             ) {
            toplam += each;
        }

        System.out.println("For each ile sayilari toplami " + toplam); //

        System.out.println("sayilar listesindeki tum elementlerin toplami: " + toplam);
        // sayilar listesindeki tum elementlerin toplami: 59


    }
}
