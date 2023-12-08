package Ders05;

import java.util.Scanner;

public class RakamlarToplami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen 5 Basamakli bir tam sayi giriniz");
        int sayi = scan.nextInt(); //12345

        int birler=0;
        int toplam=0;

        birler = sayi%10;
        toplam = toplam+birler;
        sayi=sayi/10;

        birler = sayi%10;
        toplam = toplam+birler;
        sayi=sayi/10;

        birler = sayi%10;
        toplam = toplam+birler;
        sayi=sayi/10;

        birler = sayi%10;
        toplam = toplam+birler;
        sayi=sayi/10;

        birler = sayi%10;
        toplam = toplam+birler;
        sayi=sayi/10;

        birler = sayi%10;
        toplam = toplam+birler;
        sayi=sayi/10;

        System.out.println("rakamlar toplaminiz " + toplam);




    }
}
