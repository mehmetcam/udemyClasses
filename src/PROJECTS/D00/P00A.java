package PROJECTS.D00;
import java.util.Scanner;

public class P00A {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
//
        //System.out.println("Lutfen Adinizi Giriniz:");
//
        //String name = scan.nextLine();
        //System.out.println(" ");
        //System.out.print("Lutfen Soyadinizi Giriniz");
        //String surname = scan.nextLine();


        //System.out.println(name + " " + surname);

        Scanner murat = new Scanner(System.in);
        System.out.println("Adiniz:");
        String name1 = murat.nextLine();
        System.out.println("Soyadiniz");
        String surname1 = murat.next();
        System.out.println("Sifreniz:");
        String pass = murat.next();
        System.out.println("Bilgileriniz sistemlerimize; \nAdi: " +
                name1 + "\nSoyadi: " + surname1 + "\nSifre: " + pass + "\n Olarak kaydedilmistir");

        System.out.println("1.Vize Notunuz");
        double vize1 = scan.nextDouble();
        System.out.println("2.Vize Notunuz: ");
        double vize2 = scan.nextByte();
        System.out.println("Final Notunuz: ");
        double finalNotu = scan.nextByte();

        System.out.println("------ Yil Sonu Basari Notu Hesaplamasi -----");
        System.out.println("1.Vize Notu: " + vize1);
        System.out.println("2.Vize Notu: " + vize2);
        System.out.println("Final Notu: " + finalNotu);
        System.out.println("Yil Sonu Basari Notu: " + (((vize2 + vize1) / 2) * 0.4 + finalNotu * 0.6));

    }
}
