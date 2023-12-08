package D15;

import java.util.Scanner;

public class C03_TamBolenlerSayisi {
    /*
    Soru 4- Kullanicidan main method icinde bir tamsayi alin.
    Girilen sayinin pozitif tam bolenleri sayisini bulup bize donduren bir method olusturun.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scanner.nextInt();
        System.out.println(pozitifTamBolenSayisi(sayi));

    }
    public static int pozitifTamBolenSayisi (int sayi){
        int sayac = 0;
        for (int i = 1; i <= sayi ; i++) {
            if (sayi % i == 0){
                sayac++;
            }

        }

        return sayac;

    }
}
