package Ders24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_list {
    public static void main(String[] args) {
        //Bir List Olusturma

        // List<String> isimler = new List<>() ==> List Abstract olduugu icin bu sekilde yazilmaz

        /*
        Bir liste olusturulurken
        <> icerisine data turu yazilmaz
        Data turu PRIMITIVE data turleri OLAMAZ
         */

        List<String> isimler = new ArrayList<>();

        // her list olusturdugumda bos olarak olusturulur
        // Sonra elementler TEk TEK eklenir

        System.out.println(isimler);

        isimler.add("Burhan");
        isimler.add("Seref");
        isimler.add("Gulsah");

        System.out.println(isimler); // [Burhan, Seref, Gulsah]
        // elementler ekleme sirasina gore siralanir

        // EGER en sona degil de istedigimiz bir index'e element eklemek istersek;

        isimler.add(2 , "Nergiz");

        System.out.println(isimler); // [Burhan, Seref, Nergiz, Gulsah]

        isimler.add(1, "Omer");
        System.out.println(isimler); // [Burhan, Omer, Seref, Nergiz, Gulsah]

        isimler.addAll(2 , isimler); // Araya tum isimleri ekledik
        System.out.println(isimler); // [Burhan, Omer, Burhan, Omer, Seref, Nergiz, Gulsah, Seref, Nergiz, Gulsah]

        System.out.println(isimler.add("Eyup")); // true
        System.out.println(isimler); // [Burhan, Omer, Burhan, Omer, Seref, Nergiz, Gulsah, Seref, Nergiz, Gulsah, Eyup]


    }

}
