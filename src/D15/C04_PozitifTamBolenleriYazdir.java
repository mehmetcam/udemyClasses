package D15;

import java.util.Scanner;

public class C04_PozitifTamBolenleriYazdir {
        //Soru 4- Kullanicidan main method icinde bir tamsayi alin.
        //        Girilen sayinin pozitif tam bolenlerini yanyana yazdiran
        //        bir method olusturun.
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lutfen pozitif bir tam sayi giriniz");
            int sayi = scanner.nextInt();
            pozitifTamBolenleriYadir(sayi);

        }

        public static void pozitifTamBolenleriYadir(int sayi){

            for (int i = 1; i <=sayi ; i++) {
                if (sayi%i==0){
                    System.out.print(i + " ");
                }
            }

        }
}
