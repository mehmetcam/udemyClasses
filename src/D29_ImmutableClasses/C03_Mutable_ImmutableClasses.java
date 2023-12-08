package D29_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C03_Mutable_ImmutableClasses {
    public static void main(String[] args) {

        /*
        String class'i IMMUTABLE oldugu icin yapilan degisiklikler icin
        method ile yapilan degisiklikler kalici degisiklik yapmaz
        Sadece o stir icin degisikligi uygular


        Ancakkkkk

        ArrayList MUTEABLE oldugundan
        Method ile yapilan degisiklikler KALICI OLUR
         */
        String isim = "Ramazan";

        isim.toUpperCase();

        isim.replace("a","i");

        isim.concat(" Tatar");

        System.out.println(isim); //


        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.remove(1);
        sayilar.set(1,40);
        System.out.println(sayilar);

    }
}
