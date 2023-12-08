package D17_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C02_Kullanicidan_Alinan_Sayilari_Topla {
    public static void main(String[] args) {
        //Kullanicidan toplamak uzere sayilar alin,
        //toplam 500'u gecerse bukadar yeter diyin, islemi bitirin

        Scanner scanner = new Scanner(System.in);

        double sayi = 0;
        double toplam = 0;
        int sayac = 0;

        while (toplam <=500){
            System.out.println("Lutfen toplamak uzere sayi giriniz");
            sayi = scanner.nextDouble();

            sayac++;
            toplam+=sayi;
        }

        System.out.println("Bu kadar sayi yeter," + sayac + " adet sayi girdiniz ve toplami: " + toplam);



    }
}
