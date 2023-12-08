package D14;

import java.util.Scanner;

public class D14_C03 {
    // String'i tersten yazdirma
    // Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("metin giriniz");
        String metin = scanner.nextLine(); // Java Candir
        String yeniMetin = "";


        for (int i = metin.length()-1; i >=0 ; i--) {

            System.out.print(metin.charAt(i));

        }

        int uzunluk = metin.length();

        System.out.println("");
        for (int i = uzunluk; i >0 ; i--) {
            yeniMetin += metin.substring(i-1,i);
        }
        System.out.println(yeniMetin);


    }
}
