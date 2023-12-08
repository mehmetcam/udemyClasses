package Ders11;

import java.util.Scanner;

public class C01_ternaryOperation {
    public static void main(String[] args) {
        //Kullanicidan sayi iste kontrol et 5 e bolunuyorsa 5in tam kati yazdirin. Yoksa 5in tam kati degil yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int girilenSayi = scan.nextInt();

        System.out.println( girilenSayi%5==0 ? "Sayi 5in kati" : "Sayi 5in kati degil" );

    }
}
