package D23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C03_Remove {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);
        sayilar.add(0);

        /*
        Remove iki sekilde yapilir
        remove(index)
        remove(object)

        Eger listemiz Integer'lardan olusuyorsa
        Java

         */

        System.out.println(sayilar.remove(0)); // 3

        // eleman olarak 5'i silmek gerekiyorsa
        // once bir obje olarak 5'i tanimlamaliyiz
        // sonra silmeliyiz

        Object silinecekElement = 5;
        sayilar.remove(silinecekElement);
        System.out.println(sayilar); //[2, 0]


    }

}
