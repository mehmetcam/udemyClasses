package Ders08_09;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double sayi = scan.nextDouble();

        if (sayi % 3 == 0) {
            System.out.println("3 e bolunen sayi");
            System.out.println("Kalan" + (sayi % 3));

        }
        if (sayi % 5 == 0) {
            System.out.println("3 e bolunen sayi");
            System.out.println("Kalan" + (sayi % 5));

        }
        if (sayi %5 ==0 & sayi%3==0){
            System.out.println("Bu sayi ikisine de bolunur");
        }
        if (sayi %5 !=0 & sayi%3!=0){
            System.out.println("Bu sayi bir halta yaramaz");
        }

        //else System.out.println("Bu sayi bir halta yaramaz");
    }
}