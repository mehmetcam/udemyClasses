package D15;

import java.util.Scanner;

public class C02_asalSayi {

    //Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
    // Girilen sayinin asal sayi olup olmadigini kontrol edip, sonuc olarak
    // “asal sayi” veya “asal sayi degil” yazdiran bir method olusturun.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scanner.nextInt();
        asalSayiBulucu(sayi);

    }

    public static void asalSayiBulucu(int sayi){

        int flag = 20;
        for (int i = 2; i < sayi-1; i++) {
            if (sayi % i ==0 ){
                flag++;
                break;
            }
        }

        if (flag==20){
            System.out.println("verilen sayi asal");
        }else {
            System.out.println("verilen sayi asal degil");
        }
    }

}
