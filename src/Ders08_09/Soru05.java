package Ders08_09;

import java.util.Scanner;

public class Soru05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ucgenini birinci kenarini yaz");
        int sayi1 = scan.nextInt();

        System.out.println("ucgenini birinci kenarini yaz");
        int sayi2 = scan.nextInt();

        System.out.println("ucgenini birinci kenarini yaz");
        int sayi3 = scan.nextInt();

        if (sayi1==sayi2 && sayi2==sayi3){
            System.out.println("Bu bi eskenar ucgen");
        }
        else System.out.println("Bu bir dandik ucgen");
    }
}
