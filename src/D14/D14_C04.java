package D14;

import java.util.Scanner;

public class D14_C04 {
    // Soru 10 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip kaydedin.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("metin giriniz");
        String metin = scanner.nextLine(); // Java Candir

        String tersMetin = "";

        for (int i = metin.length()-1; i >=0 ; i--) {

            tersMetin += metin.charAt(i);

        }

        System.out.println(tersMetin);

        if (metin.equalsIgnoreCase(tersMetin)){
            System.out.println("girilen metin palindron");
        }else {
            System.out.println("palindron degil");
        }

    }
}
