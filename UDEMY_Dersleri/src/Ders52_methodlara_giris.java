import java.util.Scanner;

public class Ders52_methodlara_giris {

    public static void selamlama (){
        System.out.println("Selamlar");
    }

    public static void faktoriyel(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Bir sayi giriniz");
        int sayi = scan.nextInt();
        int faktoriyel = 1;

        while (sayi>0){
            faktoriyel *= sayi;

            System.out.println("Faktoriyel= " + faktoriyel);

            sayi--;

            System.out.println("Sayi= " + sayi);

        }

        System.out.println(faktoriyel);
    }

    public static void main(String[] args) {

        faktoriyel();


    }
}
