package Ders08_09;

import java.util.Scanner;

public class Soru06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Notunuzu girin");
        int not = scan.nextInt();

        if (not<0 || not>100){
            System.out.println("sallama la");
        } else if (not==100) {
            System.out.println("En yuksek not alindi");

        } else if (not>=85){
            System.out.println("AA aldin");
        } else if (not>=50) {
            System.out.println("BB aldin");
        }
        else System.out.println("bi bok alamadin");
    }
}
