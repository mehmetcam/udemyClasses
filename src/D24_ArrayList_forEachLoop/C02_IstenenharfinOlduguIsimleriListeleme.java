package D24_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C02_IstenenharfinOlduguIsimleriListeleme {
    public static void main(String[] args) {
        // Verilen bir String array'de
        // istenen harfi iceren isimleri
        // bir Liste olarak yazdirin
        String istenenHarf = "e";
        String[] str={"derya", "ismail","sedat", "tugba","murat","sahil"};

        List<String> isimler = new ArrayList<>();

        for (int i = 0; i < str.length; i++) {
            if (str[i].contains(istenenHarf)){
                isimler.add(str[i]);
            }
        }

        System.out.println(isimler);

        

    }
}
