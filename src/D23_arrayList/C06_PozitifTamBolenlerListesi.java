package D23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_PozitifTamBolenlerListesi {

    public static void main(String[] args) {
        int sayi = 20;
        List<Integer> BolenlerListesi = new ArrayList<>();
        for (int i = 1; i <= sayi; i++) {

            if (sayi % i == 0){
                BolenlerListesi.add(i);
            }

        }

        System.out.println(BolenlerListesi);
    }

}
