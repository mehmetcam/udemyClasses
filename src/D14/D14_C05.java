package D14;

import java.util.Scanner;

public class D14_C05 {
    public static void main(String[] args) {

        //Soru 11- Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini kontrol edin ve sonucu yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez rentrez un nombre positif");
        int nombre = scanner.nextInt();

        int flag = 10;

        for (int i = 2; i <nombre-1 ; i++) {

            if (nombre % i == 0){
                flag++;
            }
        }
        if (flag == 10){
            System.out.println("Girilen sayi asal");
        }else {
            System.out.println("Girilen sayi asal degil");
        }


    }
}
