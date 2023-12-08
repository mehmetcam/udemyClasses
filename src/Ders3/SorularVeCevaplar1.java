package Ders3;

import java.util.Scanner;

public class SorularVeCevaplar1 {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("lutfen isminizi girin");

        String isim = scan.nextLine();

        System.out.println("lutfen SOY isminizi girin");

        String soyisim = scan.nextLine();

        System.out.println("lutfen yasinizi girin");

        int yasiniz = scan.nextInt();
        System.out.println("kullanici adiniz: " + isim.charAt(0)+soyisim+yasiniz);



        System.out.println("lutfen sifrenizi girin");

        String sifre = scan.nextLine();


        String kullanici = isim.charAt(0)+soyisim+yasiniz;


        System.out.println("Bilgileriniz sunlardir; Nickiniz: "  + kullanici + " Sifreniz ise; " + sifre );



























    }
}
