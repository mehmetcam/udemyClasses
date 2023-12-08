package D23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        String[] harfler = {"J", "a", "v", "l", "b", "b", "a"};

        List<String> harfListesi = new ArrayList<>();

        for (int i = 0; i < harfler.length; i++) {

            harfListesi.add(harfler[i]);


        }

        System.out.println(harfListesi); // [J, a, v, l, b, b, a]

        System.out.println(harfListesi.remove("a")); //true

        System.out.println(harfListesi); //[J, v, l, b, b, a]

        /*

        Eger parametre olarak yazarsak
        gidip o objeye uyan elementlerden ilk buldugunu siler
        delil olarak da silip silmedigini anlamamiz icin
        true/false dondurur

        Eger remove ile index verirsek
        o index'i bulamama ihtimali olmadigindan
        gidip o index'teki elemani siler, ve delil olarak sildigi elemani
        bize dondurur

         */

        System.out.println(harfListesi.remove("x")); // false

        //System.out.println(harfListesi.remove(20)); //IndexOutOfBoundsException

        System.out.println(harfListesi.remove(2)); // l

        List<String> silinenHarfler = new ArrayList<>();

        System.out.println(silinenHarfler.add(harfListesi.remove(1))); //


    }
}
