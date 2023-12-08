package D13;

import java.util.Scanner;

public class D13_C06 {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("20'den kucuk bir sayi giriniz");
        int sayi = scanner.nextInt();
        long faktoriyel = 1;

        if (sayi<20){
            for (int i = 1; i <=sayi ; i++) {
                faktoriyel*=sayi;
            }
            System.out.println("sonuc: " + faktoriyel);
        }
    }
}
