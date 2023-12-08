package D20_arrays;

import D19_ARRAYS.C02_ArrayElemanlariniArttir;

import java.util.Arrays;
import java.util.Scanner;

public class C01_KullaniciyaArrayOlusturtma {
    public static void main(String[] args) {
        /*
        Soru 5- Kullanicidan array’in boyutunu ve
        tam sayi elementlerini alip array’i olusturan ve
        bize donduren bir method olusturun.
         */
        System.out.println("ilk array: "+Arrays.toString(arrayOlustur()));



        int[] benimArray = arrayOlustur();
        System.out.println("benim array: "+Arrays.toString(benimArray));

        // benim array"imdeki tum sayilari 4 arttirin

        benimArray = C02_ArrayElemanlariniArttir.elemanlariArtir(benimArray, 4);

        System.out.println(Arrays.toString(benimArray));

    }


    public static int[] arrayOlustur(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen array'e kac eleman koyacaginizi giriniz");

        int elemanSayisi = scanner.nextInt();

        int[] arr = new int[elemanSayisi];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Array'e eklemek icin bir tamsayi giriniz");
            arr[i] = scanner.nextInt();

        }

        return arr;
    }

}
