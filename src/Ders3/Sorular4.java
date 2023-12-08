package Ders3;

import java.util.Scanner;

public class Sorular4 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdortgenin alt kenarini yaz cabuk");

        int altkenar = scan.nextInt();

        System.out.println("Dikdortgenin yan kenarini yas len");

        int yankenar = scan.nextInt();

        System.out.println("Alan; " + altkenar * yankenar +" Cevre; " + 2 * altkenar + yankenar );




    }
}
