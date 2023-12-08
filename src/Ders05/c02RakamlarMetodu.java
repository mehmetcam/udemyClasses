package Ders05;

import java.util.Scanner;

public class c02RakamlarMetodu {

    public static void main(String[] args) {
        //Kullanicidan alinan 3 basamakli bir tam sayinin rakamlar toplamini bulun

       // System.out.println(23/5); // 4

        //System.out.println(123%10); // 3

        //System.out.println(123/10); // 12.3 ==> 12

        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamakli bir tam sayi giriniz");
        int sayi = scan.nextInt();

        // 3 basamak icin ayni islemi 3 kere yapmamiz gerekir

        int birler=0;
        int rakamlarToplami=0;

        // Sayinin birler basamagindaki 3 icin

        birler=sayi%10; //3

        rakamlarToplami = rakamlarToplami+birler;

        sayi=sayi/10; // 12

        //Girilen sayinin 10lar basamagindaki 2 için

        birler=sayi%10; // 12%10 ==> 2

        rakamlarToplami = rakamlarToplami+birler; // 3+2=5

        sayi=sayi/10;
        //sayinin birler basamagi icin

        birler=sayi%10;
        rakamlarToplami=rakamlarToplami+birler;

        sayi=sayi/10;

        System.out.println(rakamlarToplami);






    }
}
