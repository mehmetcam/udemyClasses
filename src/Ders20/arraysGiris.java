package Ders20;

import java.util.Arrays;

public class arraysGiris {

    public static void main(String[] args) {
        int[] sayilar = {2,4,6,7,8};
        System.out.println(sayilar[3]);

        String[] harfler = {"a" , "b", "c"};
        System.out.println(harfler[0]);

        String[] ogrenciList = {"Burhan" , "Ramazan" , "samet" , " Senol"};
        System.out.println(ogrenciList[1]);

        // 5 kisilik bir sinif olusturun

        String[] sinifListesi1 = {null, null, null, null, null};

        String[] sinifListesi2 = new String[5];

        /*
        Bir Array olusutrulurken 2 sey mutlaka belirtilmelidir;
        1- Icine konulacak datalarin turu
        2- Array'in uzunlugu (Bir Array'e olusturulurken yazilan degerinden daha fazla element konulamaz

         */


        // Bir array'in turunu nasil yazdirabiliriz ?

        System.out.println(sayilar);

        // dongu ile yazalil

        for (int i = 0; i < sayilar.length; i++) {
            System.out.print(sayilar[i] + " ");

        }

        // Array'in tamamini yazdirmak isterseniz
        // Array class'indan hazir method kullaniriz
        //toString formulue

        System.out.println(Arrays.toString(sayilar));

        // For Loop ile Array'in butun elemanlarini yazdik ---- Array'in elementlerini yazdirin derlerse bununla yazin
        //Arrays.toString() ile Array'in kendisini yazdik. ---- Array'in kendisini yazdirin derlerse bununla yazin

        System.out.println(Arrays.toString(harfler));

        System.out.println(Arrays.toString(sinifListesi1)); // [null, null, null, null, null]
        System.out.println(Arrays.toString(sinifListesi2)); // [null, null, null, null, null]

        int[] notlar = new int[4];
        System.out.println(Arrays.toString(notlar)); // [0, 0, 0, 0]

        boolean[] blList = new boolean[8];
        System.out.println(Arrays.toString(blList)); // [false, false, false, false, false, false, false, false]


    }

}
