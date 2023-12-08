import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Ders40_HesapMakinesi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String islemler =   "1. Toplama Islemi\n"
                            +"2. Cikarma Islemi\n"
                            +"3. Carpma Islemi\n"
                            +"4. Bolme Islemi";

        System.out.println("****************************");
        System.out.println(islemler);
        System.out.println("****************************");
        System.out.println("Islemi Seçiniz");
        String islem = scan.nextLine();
        int a;
        int b;
        switch (islem){
            case "1":
            System.out.println("Birinci Sayi: ");
            a = scan.nextInt();
            System.out.println("ikinci Sayi: ");
            b = scan.nextInt();
            System.out.println("Sonucunuz: " + (a + b));
            break;

            case "2":
                System.out.println("Birinci Sayi: ");
                a = scan.nextInt();
                System.out.println("ikinci Sayi: ");
                b = scan.nextInt();
                System.out.println("Sonucunuz: " + (a - b));
                break;
            case "3":
                System.out.println("Birinci Sayi: ");
                a = scan.nextInt();
                System.out.println("ikinci Sayi: ");
                b = scan.nextInt();
                System.out.println("Sonucunuz: " + (a * b));
                break;
            case "4":
                System.out.println("Birinci Sayi: ");
                a = scan.nextInt();
                System.out.println("ikinci Sayi: ");
                b = scan.nextInt();
                System.out.println("Sonucunuz: " + ((double)a / b));
                break;
            default:
                System.out.println("Secilen islem numarasi hatali");


        }

    }

}
