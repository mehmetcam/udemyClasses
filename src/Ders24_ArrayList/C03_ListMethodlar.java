package Ders24_ArrayList;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class C03_ListMethodlar {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        System.out.println(sayilar); // []
        System.out.println(sayilar.size()); // 0
        System.out.println(sayilar.isEmpty()); // true

        sayilar.add(3);
        sayilar.add(5);

        System.out.println(sayilar); // [3, 5]
        System.out.println(sayilar.size()); // 2
        System.out.println(sayilar.isEmpty()); // false

        System.out.println(sayilar.get(1)); // 5
        /*
        Bu, verilen indexteki elementi dondurur
         */

        System.out.println(sayilar.contains(3)); // true

        List<Integer> tumSayilar = new ArrayList<>();           // CONTAINS ALL ORNEGI
        tumSayilar.add(1);
        tumSayilar.add(3);
        tumSayilar.add(5);
        tumSayilar.add(7);

        System.out.println(tumSayilar.containsAll(sayilar)); // true



    }
}
