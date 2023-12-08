package Ders10;

import java.util.Scanner;

public class C01_ifElese_Cozumu {

    public static void main(String[] args) {

        /*
        Ornek: Kullanicidan cinsiyetini ve yasini alin
        Kadin 60 yas ve uzeri, Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak "Emekli olabilirsin" veya Emekli olmak icin ... yil daha calisman gerekir" YAZDIRIN
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz");
        String cinsiyet = scan.nextLine();
        System.out.println("Lutfen yasinizi giriniz");
        double yas = scan.nextDouble();

        if (yas < 0 || yas > 90) {
            System.out.println("Girilen yas geçersiz");


        } else if (!(cinsiyet.equalsIgnoreCase("Kadin") || cinsiyet.equalsIgnoreCase("Erkek")   )) {
            System.out.println("Girilen Cinsiyet Geçersiz");
        } else if (cinsiyet.equalsIgnoreCase("Kadin")&& yas >60) {
            System.out.println("Emekli Olabilirsin");
            
        } else if (cinsiyet.equalsIgnoreCase("Kadin") && yas <60) {
            System.out.println("Emekli olmak için "+(60-yas) +" yil daha calisman gerek " );
            
        } else if (cinsiyet.equalsIgnoreCase("Erkek") && yas > 65) {
            System.out.println("Emekli olabilirsin");

        } else if (cinsiyet.equalsIgnoreCase("Erkek") && yas <65) {
            System.out.println("Emekli olmak için "+(65-yas) +" yil daha calisman gerek " );

        }


    }
}
