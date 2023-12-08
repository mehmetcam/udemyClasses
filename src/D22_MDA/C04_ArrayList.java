package D22_MDA;

import java.util.ArrayList;
import java.util.List;

public class C04_ArrayList {
    public static void main(String[] args) {
        List<Integer> sayilar = new ArrayList<>();

        ArrayList<Integer> abc = new ArrayList<>(); // bu yazim cok kullanilmaz

        // List'e eleman eklemek icin

        sayilar.add(7);
        sayilar.add(2);
        sayilar.add(9);

        System.out.println(sayilar); //[7, 2, 9]

        sayilar.add(1,5);

        System.out.println(sayilar); //[7, 5, 2, 9]

        // 5 var mi ?

        System.out.println(sayilar.contains(5)); //true


    }
}
