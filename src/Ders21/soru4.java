package Ders21;

import java.util.Scanner;

public class soru4 {

    public static void main(String[] args) {

        // Soru 4: Verilen bir array'da istenen bir elemanin var olup olmadigini
        // ve varsa kac kere kullanildigini yaazdiran bir method olusturun

        int[] arr = {2, -4, 3, 5, 9, 3, 78, 10};

        System.out.println(sayiBulucu(arr));



    }

    public static int sayiBulucu(int[] arr){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen o sayiyi giriniz");
        int girilenSayi = scanner.nextInt();

        int sayac = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]  == girilenSayi){
                sayac++;
            }

        }

        return sayac;

    }


}
