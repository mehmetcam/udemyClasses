package Ders3;

import java.util.Scanner;

public class Sorular5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ismini soyle!");

        String isim = scan.nextLine();

        System.out.println("Soyadin ne senin??!!!");

        String soyisim = scan.nextLine();

        System.out.println("Yasini soyle bir de bakiim");

        int yas = scan.nextInt();

        System.out.println("Girilen bilgiler; " + isim.charAt(0) + " " + soyisim +", " + yas );

    }
}
