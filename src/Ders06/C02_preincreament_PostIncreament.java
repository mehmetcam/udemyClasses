package Ders06;

public class C02_preincreament_PostIncreament {
    public static void main(String[] args) {
        int sayi=10;
        //sayi degerini olusturacagimiz b varable'ina atiyalim
        //ve sonra sayi degerini 1 arttiralim

        int b = sayi;

        sayi++;

        //System.out.println(sayi);
        //System.out.println(b);

        //bunu tek satirda yapabilir miyiz?//

        //sayi degerini olusturacagimiz c variable'ina atiyalim
        //ve sonra sayi degerini 1 arttiralim

        int c=sayi++;
        System.out.println(c);
        System.out.println(sayi);

        sayi=11;
        c=++sayi;
        System.out.println(c);
        System.out.println(sayi);

        int ayi=10;
        ayi++;
        System.out.println(ayi);



    }
}
