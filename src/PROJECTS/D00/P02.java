package PROJECTS.D00;

import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {
       /* soru:
        Kullanıcıdan decimal bir sayı alıp bu sayının binary karşılığını yazdırın.
        Decimal : 10'luk taban (Günlük hayat 0,1,2,3,4,5,6,7,8,9)
        Binary  : 2'lik tabandaki karşılığıdır. (0,1)

        */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi = scan.nextInt();
        String binaryDeger=Integer.toBinaryString(sayi);
        System.out.println(binaryDeger);


    }
}
