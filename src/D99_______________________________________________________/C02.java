package D99_______________________________________________________;

import java.util.Arrays;
import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {
        // Verilen int bir array'deki cift sayilarin toplamini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen arrayin eleman sayisini yazalim");
        int elemanSayisi = scanner.nextInt();

        int[] arr = new int[elemanSayisi]; // array olusturma


        for (int i = 0; i < elemanSayisi; i++) {

            System.out.println("Lutfen array'e eleman atayiniz");

            arr[i] = scanner.nextInt();

        }

        System.out.println(Arrays.toString(arr));

        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {


            if (arr[i] % 2 == 0 ){
                toplam += arr[i];

            }

        }

        System.out.println("Array'deki cift sayilar toplami: " + toplam);


    }
}
