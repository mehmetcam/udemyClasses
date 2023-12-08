package Ders26_Constructions;

import java.util.Arrays;

public class C02_HarfKullanimAdedi {
    public static void main(String[] args) {

        /*
        Soru4-Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        kullanilmadiysa "harf cumlede kullanilmamis yazdirin.
         */

        String cumle = "Java her gecen gun daha zevkli hale geliyor";
        String harf = "a";

        String[] cumleArr = cumle.split("");

        System.out.println(Arrays.toString(cumleArr));

        int sayac = 0;

        for (String each: cumleArr
             ) {

            if (each.equals(harf)){           // Stringlerde == kullanilmaz
                sayac++;
            }

        }

        System.out.println(harf + " harfinin kullanilma sayisi: " + sayac);

    }
}
