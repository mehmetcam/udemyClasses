package Ders13;

import java.util.Scanner;

public class minnak_tekrar {

    int i = 0;


    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.println("Bir baslangic sayisi girin: ");
        int baslangicSayisi = scanner.nextInt();

        System.out.println("Bir bitis sayisi girin: ");
        int bitisSayisi = scanner.nextInt();

        if (bitisSayisi<baslangicSayisi){
            System.out.println("sence mantikli mi ? ");
        }
        else {
            int toplam = 0;
            for (int i = baslangicSayisi ; i<=bitisSayisi; i++){
                toplam += i;


            }
            System.out.println("aradaki rakamlar toplami: " + toplam);

        }




    }
}
