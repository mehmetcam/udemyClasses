package D17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C07_DoWhileLoop {
    public static void main(String[] args) {
        /*
        While Loop'ta parantez içinde kontrol edilen degiskene
        Biz loop'tan once deger atiyoruz

        Eger bu degiskene uygun olmayan bir deger atamasi yaparsak
        loop hiç calismaz

        Java bu durumun onune gecmek icin
        yani kontrolu kullanicidan deger aldiktan sonra yapabilmemiz icin
        do-while loop'u olusturmustur

        do-while

         */


        /*
        Bir ogretmenden not ortalamsi bulmak için notlari alin
        Ogretmen islemi bitirmek icin negatif bir sayi girmelidir
        Ogretmen negatif sayi girdiginde toplam kac not girdigini,
        not ortalamasinin kac oldugunu ve
        En yuksek notu yazdirin
        */

        Scanner scanner = new Scanner(System.in);
        double not = 0;
        double toplam = 0;
        int sayac = 0;
        /*
        while (not >= 0) {
            System.out.println("Ortalama hesaplamak için notlari giriniz\nBitirmek için negatif sayi girmelisiniz");
            not = scanner.nextDouble();
            if (not >= 0) {
                toplam += not;
                sayac++;
            }
        }
         */

        do {
            System.out.println("Ortalama hesaplamak için notlari giriniz\nBitirmek için negatif sayi girmelisiniz");
            not = scanner.nextDouble();
            if (not >= 0) {
                toplam += not;
                sayac++;
            }
        }
        while (not >= 0);



        System.out.println("Girilen not sayisi= " + sayac + "\nGirilen notlarin ortalamasi= " + toplam / sayac);

    }
}

