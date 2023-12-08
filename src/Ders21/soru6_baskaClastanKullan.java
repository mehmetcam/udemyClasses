package Ders21;

import java.util.Arrays;


//Baska class'dan method kullanma

public class soru6_baskaClastanKullan {

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8};

        System.out.println("eski array: " +Arrays.toString(arr));
        arr = soru2.elementleriArttir(arr,4);
        System.out.println("yeni array: " + Arrays.toString(arr));


        System.out.println(soru3.pozitifElementleriTopla(arr));

        soru4_cozum.elemanSay(arr,6); // method void oldugu icin bizim SOUT yapmamiza gerek yok


        // kullancidan deger alarak int bir array olusturmak istiyorum

        int[] kullaniciArrayi = soru5.arrayOlustur();

        System.out.println(Arrays.toString(kullaniciArrayi));


    }




}
