package Ders22;

import java.util.Arrays;

public class C02_sort_arrays {

    public static void main(String[] args) {
        String[] harfler = {"L", "a", "P", "d", "T", "t"};

        System.out.println(Arrays.toString(harfler)); // [L, a, P, d, T, t]

        Arrays.sort(harfler);

        System.out.println(Arrays.toString(harfler)); // [L, P, T, a, d, t]

        /*
        Arrays.sort() methodu aray'deki elementleri
        natural order'a gore siralar

        Array'lerde ve bundan sonra gorecegimiz ArrayList'lerde method kullanildiginda array veya ArrayList kalici olarak degisir

         */

        String[] isimler = {"Ayse", "Yusuf", "Bugra" ,"Burak", "Abdullah", "Nergis","Neslihan", "Gulay", "Ramazan"};

        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler));

        int[] sayilar = {4, 78, 56,65,12,20,33};

        Arrays.sort(sayilar,3,6);

        System.out.println(Arrays.toString(sayilar));

        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));



    }
}
