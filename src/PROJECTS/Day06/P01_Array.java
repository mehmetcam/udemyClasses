package PROJECTS.Day06;

import java.util.Arrays;
import java.util.Scanner;

public class P01_Array {
    // kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
    //kullanicidan alan ve girilen array elemanlarinin en buyuk ile en kucuk
    //elemaninin arasinki farki gosteren java programi yazin

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen array'de olmasini istediginiz eleman sayisini giriniz");
        int sayi = scan.nextInt();

        int arr[] = new int[sayi];

        for (int i = 0; i < arr.length; i++) {

            System.out.println(" i gir");
            int sayi2 = scan.nextInt();
            arr[i] = sayi2;

        }

        Arrays.sort(arr); //olusan array'in sayisal siralamada olmama ihtimaline bianen naturel siralama yaptik
        int arrMax = arr[arr.length-1];
        int arrMin = arr[0];

        System.out.println("en buyuk en kucugun aralarindaki fark = "+ (arrMax-arrMin));

    }
}
