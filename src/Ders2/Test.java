package Ders2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Sinavdan kaç aldin?");
        int sayi = scan.nextInt();

        if(sayi>100){
            System.out.println("Yalanci Serefsiz");
        }

        else if (sayi >50){
            System.out.println("Geçtiniz");}

        else System.out.println("Kaldiniz");







    }
}
