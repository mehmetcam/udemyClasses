package PROJECTS.D00;

import java.util.Scanner;

public class P03 {
    public static void main(String[] args) {
        /*
        Kullanicidan iki double sayi alin ve ilk sayiyi ikinci sayiya bolup sonucu tam sayi yazdirin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen iki adet ondalikli sayi girin");
        System.out.println("Birinci sayi: ");
        double sayi1 = scan.nextDouble();
        System.out.println("ikinci sayi: ");
        double sayi2 = scan.nextDouble();
        System.out.println("Sayilarin bolumu: " + (int)(sayi1/sayi2));




    }

}
