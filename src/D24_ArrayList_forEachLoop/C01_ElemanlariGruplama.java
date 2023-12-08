package D24_ArrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ElemanlariGruplama {
    public static void main(String[] args) {
        // Verilen bir Integer Array'de
        // Elementleri 3'erli gruplar halinde toplayip
        // Bu toplamlari bir liste olarak yazdirin

        int[] arr = {3,6,1,9,2,0,6,3,-1,-5,9,11};
        //output : [10,11,8,15]

        List<Integer> toplamlarListesi = new ArrayList<>();
        int toplam = 0;
        int sayac = 1;

        for (int i = 0; i < arr.length; i++) {

            if (sayac==3){
                toplamlarListesi.add(toplam);
                sayac =0;
                toplam=0;
                toplam+=arr[i];
                sayac=1;


            }else {
                toplam += arr[i];
                sayac++;
            }

        }

        System.out.println(toplamlarListesi);

        System.out.println(toplamlariGruplandir(arr)); //


    }

    public static List<Integer> toplamlariGruplandir(int[] arr) {
        List<Integer> toplamListesi = new ArrayList<>();

        for (int i = 0; i < arr.length; i += 3) {
            int toplam = 0;

            for (int j = i; j < i + 3 && j < arr.length; j++) {
                toplam += arr[j];
            }

            toplamListesi.add(toplam);
        }

        return toplamListesi;
    }

}
