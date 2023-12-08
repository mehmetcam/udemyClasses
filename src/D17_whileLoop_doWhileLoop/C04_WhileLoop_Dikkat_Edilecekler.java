package D17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C04_WhileLoop_Dikkat_Edilecekler {
    public static void main(String[] args) {
        /*
        1- While parantezinde kontrol ettigimiz degisken,
            loop icerisinde degistirilmez ise sonsuz loop olusur
         */
        int sayi = 5;
        int sayac = 0;
        while(sayi <=10){
            sayac++;
            System.out.println(sayac);
            sayi++;

        }

        /*
        2- eger loop olusturulmadan once
            ihtiyac duydugumuz variable'lari biz olusturuyosak
            loop'un ilk defa calismasini ve kullanicidan degerler alinmasini ENGELLEMEYECEK
            degerler atamaya DIKKAT ETMELIYIZ

       Kullanicidan sayilar isteyin, verilen sayilar pozitif oldugu muddetce sayilari toplayalim
       ve negatif sayi girildiginde toplami yazdiralim
         */

        sayi = 20;
        int toplam = 0;
        Scanner scanner = new Scanner(System.in);
        while(sayi >0){
            System.out.println("lutgen toplamak uzere sayi giriniz");
            sayi = scanner.nextInt();
            if (sayi>0) toplam +=sayi;

        }
        System.out.println(toplam);
    }

        /*
        3- Eger loop parantezinde yazdigimiz degisken icin
            loop icerisinde kullanicidan deger aliyorsak
            aldigimiz degerin, loop'u bitirme ozelligi OLMAYAN bi deger oldugundan
            emin olduktan sonra islemimizi yapmaliyiz
            if (sayi>0) toplam +=sayi;
            GIBI
         */
}
