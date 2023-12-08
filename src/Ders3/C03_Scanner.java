package Ders3;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {

        //Kullanicidan bir kelime isteyip kelimenin ilk harfini yazidirn

        Scanner scan = new Scanner(System.in);

        System.out.println ("Lufen kelime gir");

        char ilkHarf=scan.next().charAt(0);

        //Scanner class da scan.nextChar() yoktur
        //bunun yerine scan.next() kullanup charAt() kullaniilir


        System.out.println("ilk harfiniz " + ilkHarf);

    }
}
