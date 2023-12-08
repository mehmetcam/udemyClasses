package D20_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C01A_KullaniciyaArrayOlusturanMethod {

        /*
        Soru 5- Kullanicidan array’in boyutunu ve
        tam sayi elementlerini alip array’i olusturan ve
        bize donduren bir method olusturun.
         */

    public static void main(String[] args) { // 1- Main Methodumuzu Olusturalim
        System.out.println("Olusturdugunuz array su sekilde: " + Arrays.toString(arrayOlustur()));
    }

    public static int[] arrayOlustur(){ // 2- Bir method olusturalim, burada dondurecek dedigi icin int[] tipinde gonderiyoruz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen array'in boyutunu giriniz");
        int elemanSayisi = scan.nextInt();

        int arr[] = new int[elemanSayisi];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Lutfen array'e eklemek icin bir tamsayi giriniz");
            arr[i] = scan.nextInt();
        }

        return arr;

    }
}
