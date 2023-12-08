package Ders24_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class C05_Get_Set_Methodu {
    public static void main(String[] args) {
        List<String> isimler = new ArrayList<>();
        isimler.add("Cemil");
        isimler.add("Omer");
        isimler.add("Mertkan");

        isimler.add(2, "Burhan");
        System.out.println(isimler); // [Cemil, Omer, Burhan, Mertkan]

        // SET METHODU ISEEEE
        // ELEMENTI BULUR VE UPDATE EDER

        isimler.set(2,"Ayse");
        System.out.println(isimler); // [Cemil, Omer, Ayse, Mertkan]
        /*
        GET METHODU ISE GETIRIR
         */
        System.out.println(isimler.get(2)); // Ayse





    }
}
