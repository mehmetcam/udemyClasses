import java.util.Scanner;

public class Ders48_Armstrong {
    /* Girilen sayinin Amstrong sayisi oldugunu anlamak*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Armstrong sayisi tespit makinasi. Sayiyi giriniz: ");
        int sayi = scan.nextInt();
        System.out.println("Basamak sayisi: ");
        int basamak_sayisi = scan.nextInt();

        int gecici_sayi = sayi;
        int toplam = 0;

        do {
            int basamak_degeri = gecici_sayi % 10;
            gecici_sayi /=10;

            toplam += Math.pow(basamak_degeri,basamak_sayisi);


        }while(gecici_sayi>0);


        if(sayi == toplam){
            System.out.println("Bu bir amstrong sayisidir");
        }
        else {
            System.out.println("Amstrong degildir");
        }



    }
}
