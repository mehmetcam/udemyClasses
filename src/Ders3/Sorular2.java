package Ders3;

import java.util.Scanner;

public class Sorular2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ilcenin nufusu");

        int nufus = scan.nextInt();

        System.out.println("Kisi basi gunlu Ortalama tuketilen tahil miktari: ");

        double tahil = scan.nextDouble();

        System.out.println("Yillik tuketilen tahil miktari; " + nufus * tahil *1000 );






    }
}
