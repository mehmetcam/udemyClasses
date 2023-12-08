package D99_______________________________________________________;


import java.util.Arrays;
import java.util.Scanner;

public class C01_TeamWork {

        /*
        Soru 5- Kullanicidan array’in boyutunu ve
        tam sayi elementlerini alip array’i olusturan ve
        bize donduren bir method olusturun.
         */

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayOlustur()));
        // 7
        //[5, 9, 7]
    }

    public static int[] arrayOlustur(){

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen array'in boyutunu giriniz");
        int elemanSayisi = scan.nextInt();

        int arr[] = new int[elemanSayisi];

        for (int i = 0; i < arr.length; i++) {

            System.out.println("Array'e eklemek icin sayi girin");
            arr[i] = scan.nextInt();
            //3 -> 2.indexe kadar

        }

        return arr;

    }

}
