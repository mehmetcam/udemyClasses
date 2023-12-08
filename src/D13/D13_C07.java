package D13;

import java.util.Scanner;

public class D13_C07 {
    public static void main(String[] args) {
        //Soru 6- Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        // Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

        Scanner scanner = new Scanner(System.in);
        System.out.println("20'den kucuk bir sayi giriniz");
        int sayi = scanner.nextInt();
        long faktoriyel = 1;

        System.out.print(sayi + "! = ");
        for (int i = sayi; i >=1 ; i--) {
            faktoriyel *= i;
            if (i!=1){
                System.out.print(i + " * ");
            }else{
                System.out.print(i + " = ");
            }
        }
        System.out.println(faktoriyel);
    }
}
