package Ders2;

import java.util.Scanner;

public class TestW {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Sinavdan kaç aldiniz");
        int sayi = scan.nextInt();

        if (sayi>= 0){
            System.out.println("Yalanci serefsiz");
        }


    }

}
