package D19_ARRAYS;

import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] sayilar = {3, -5, 4, 6, -2, 9, 1};
        //sayilar array'indeki tum sayilari 3 arttirip kaydedin.
        sayilar = C02_ArrayElemanlariniArttir.elemanlariArtir(sayilar,3);
        System.out.println(Arrays.toString(sayilar)); // [6, -2, 7, 9, 1, 12, 4]

        System.out.println(C03_SayilariTopla.pozitifElementleriTopla(sayilar)); // 39

        String[] isimler = {"ali", "veli" , "saido" , "sahil" , "ali" , "mehmet"};

        // isimler array'inde mehmet ismi kac kere kullanilmis ?

        C04_KullanimadediniBUlma.elemanArama(isimler, "mehmet"); // Istenen eleman mehmet 1 kere kullanilmis

        C04_KullanimadediniBUlma.elemanArama(isimler, "ali"); // Istenen eleman ali 2 kere kullanilmis


    }
}

