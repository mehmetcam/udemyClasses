package Ders08_09;

import java.util.Scanner;

public class Soru2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir harf giriniz");
        char ilkHarf = scan.next().charAt(0);

        if (ilkHarf == 'o' || ilkHarf == 'O') {
            System.out.println("Ocak");
        }
        if (ilkHarf == 's' || ilkHarf == 'S') {
            System.out.println("Subat");
        }

        if (ilkHarf == 'm' || ilkHarf == 'M') {
            System.out.println("Ocak");
        }

        if (ilkHarf == 'm' || ilkHarf == 'M') {
            System.out.println("Ocak");
        }
    }
}
