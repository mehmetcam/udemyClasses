package Ders13;

// Kullanicidan sifre girmesini iste;
// Su durumlar saglanincaya kadar tekrar deger isteyin
// Ve sartlar saglanirsa "Siffe basariyla kaydedildi" deyin.
 // Sartlar
// 1- ilk harf kucuk olmali
// 2- son karakter rakam olmali
// 3- siifre bosluk icermemeli
//4- uzunlugu en az 10 karakter olmali

import java.util.Scanner;

public class whileSoru {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean sonuc = false;



        while (sonuc==false) {
            System.out.println("SIfrenizi girniz");
            String sifre = scanner.nextLine();
            System.out.println(sifreKontrolEt(sifre));
            sonuc = sifreKontrolEt(sifre);


        }


    }

    public static boolean sifreKontrolEt(String sifre) {
        int sayac= 0; // sayac hatalari saysin.

        //ilk hard kucuk harf olmali
        char ilkHarf=sifre.charAt(0);
        if(!(ilkHarf>='a' && ilkHarf<='z')){

            System.out.println("ilk harf kucuk olmali");
            sayac++;

        }



        // 2- son karakter rakam olmali
            char sonKarakter = sifre.charAt(sifre.length()-1);
            if (!(sonKarakter>='0' && sonKarakter<='9')) {
                System.out.println("Son karakter rakam olmali");
                sayac++;

            }

        // 3- siifre bosluk icermemeli

        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            sayac++;
        }

        //4- uzunlugu en az 10 karakter olmali

        if (sifre.length()<10){
            System.out.println("Sifre en az 10 karakter olmali");
            sayac++;

        }

        if (sayac == 0){
            return true;
        }else {
            return false;
        }
    }


}
