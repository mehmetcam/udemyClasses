package Ders22;

import java.util.Arrays;

public class C04_StringSplitMethodu {
    public static void main(String[] args) {
        String str = "Java Candir, Selenyum heyecan";

        String[] kelimeler =  str.split(" ");

        System.out.println(Arrays.toString(kelimeler)); // [Java, Candir,, Selenyum, heyecan]

        String[] yeniArr = str.split(", ");

        System.out.println(Arrays.toString(yeniArr)); // [Java Candir, Selenyum heyecan]

        String[] karakterler = str.split("");

        System.out.println(Arrays.toString(karakterler)); // [J, a, v, a,  , C, a, n, d, i, r, ,,  , S, e, l, e, n, y, u, m,  , h, e, y, e, c, a, n]



    }
}
