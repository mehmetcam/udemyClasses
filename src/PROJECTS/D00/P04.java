package PROJECTS.D00;

import java.util.Scanner;

public class P04 {
    public static void main(String[] args) {
        /*
          Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
          dort islemden biri ile isleme koyup sonucun yazdiriniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen islem yapacaginiz iki sayiyi giriniz ( +, -, *, / )");
        System.out.println("Birinci sayi: ");
        double sayi1 = scan.nextDouble();
        System.out.println("ikinci sayi: ");
        double sayi2 = scan.nextDouble();
        System.out.println("Lutfen yapmak istediginiz islemi seçiniz");
        char islem = scan.next().charAt(0);
        if (islem == '+'){
            System.out.println("Islem sonucu " + (sayi1 + sayi2));
        }
        else if (islem == '-'){
            System.out.println("Islem sonucu " + (sayi1 - sayi2));
        }
        else if (islem == '*'){
            System.out.println("Islem sonucu " + (sayi1 * sayi2));
        }
        else if (islem == '/'){
            System.out.println("Islem sonucu " + (sayi1 / sayi2));
        }
        else {
            System.out.println("insan gibi soru sor");
        }
    }
}
