package D24_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class C03_ArrayiListHalineDonusturme {





    public static void main(String[] args){
            Integer[] sayilarArray = {1, 2, 3, 6, 7, 4, 3, 5};
            /*

             Bir array'i list haline getirmek icin
             En guvenilir yontem, bir loop ile tum elementleri
             List'e kopyalamaktir
             Aslinda daha kisa bir yol vardir
             ama iki buyuk yan etkisi oldugundan
             bunlara dikkat etmek gerekir

             1- Olusturdugumuz Liste

            */

            List<Integer> sayilarListesi = Arrays.asList(sayilarArray);

            // sayilar Listesine 9'u ekleyin

            //sayilarListesi.add(9); //.UnsupportedOperationException

            //Listeden 7'yi silin

            Object silinecekEleman = 7;


        }




    }

