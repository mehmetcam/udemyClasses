package Ders3;

import java.util.Scanner;

public class Sorular3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Isminizi Giriniz stp");

        String isim = scan.nextLine();

        System.out.println("Soy isminizi giriniz");

        String soyisim = scan.nextLine();

        System.out.println("Yzsinizi Giriniz");

        int yas = scan.nextInt();

        System.out.println("Ilcenin nufusu " + isim);
        System.out.println("Ilcenin nufusu " + soyisim);
        System.out.println("Ilcenin nufusu " + yas);
        System.out.println("Hersey tamam hadi yoluna");



    }
}
