package Ders08_09;

import java.util.Scanner;

public class Soru1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi yaz 5 in kati mi bakalim");
        int sayi = scan.nextInt();

        if( sayi %5 == 0){
            System.out.println("Sayi 5 e tam bolunur");

        }


    }
}
