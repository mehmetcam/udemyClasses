package Ders3;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        //Kullanicidan isim alip yazdirin

        //1. adim scanner objesi olusutur

        Scanner scan = new Scanner(System.in);

        //2. adim kullaniciya ne istedigimizi soralim

        System.out.println("Lutfen isminizi giriniz");

        //3. adim scan ojbesini kullanarak kullanicidan bilgiyi alip olusturacagimiz
        //      uygun bir variable'a kaydedelim

        String kullaniciIsmi = scan.nextLine();

        //next() metodu ilk space e kadarki metni alirken nextline() tum satiri alir

        System.out.println("Girinlen kullanici ismi :" + kullaniciIsmi);



    }
}
