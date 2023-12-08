package PROJECTS.D00;

import java.util.Scanner;

public class P01 {
    public static void main(String[] args) {
                /*
                Kullanıcdan bir harf girmesini isteyiniz. O harften sonra gelen harfleri
                 Girdiğiniz harf :
                 Girdiğiniz harften sonraki  3 harf :
                 şeklinde yazdırın.
                */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf yaziniz");
        char harf = scan.next().charAt(0);

        System.out.println("Girdiginiz harf: " + harf);
        System.out.println("Sonraki 3 harf ise: " + (char)(harf+1)+ ", " +(char)(harf+2)+ ", " +(char)(harf+3));



    }
}
