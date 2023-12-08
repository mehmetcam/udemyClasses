package Ders3;

import java.util.Scanner;

public class Hatirlamaca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Adini Gir nickini vereyim canim");

        String isim = scan.next();

        System.out.println("Soyadini gir bebisim");

        String soyisim = scan.next();

        System.out.println("Yasini gir bir de");

        int yas = scan.nextInt();

        System.out.println("Nickin senin: " + isim.charAt(0)+soyisim.charAt(0)+yas);


    }
}
