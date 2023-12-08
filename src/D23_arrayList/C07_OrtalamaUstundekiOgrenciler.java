package D23_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C07_OrtalamaUstundekiOgrenciler {
    public static void main(String[] args) {
        // bir ogretmenden ogrenci ismini ve notunu isteyin
        // ogretmen Q'ya bastiginda islemi bitirip
        // ortalama uzerinde not alan ogrencilerin isimlerini list olarak yazdirin
        // ipucu : isimleri ve notlari ayri 2 liste olarak tutun

        Scanner scanner = new Scanner(System.in);

        List<String> isimlerListesi = new ArrayList<>();

        List<Double> notlarListesi = new ArrayList<>();

        double girilenNot = 0;
        double notToplami = 0;
        String girilenisim ="";
        while (!girilenisim.toUpperCase().equals("Q")){
            System.out.println("Lutfen ogrenci ismini girin");
            girilenisim = scanner.nextLine();

            if (!girilenisim.toUpperCase().equals("Q")){

                isimlerListesi.add(girilenisim);
                System.out.println("Lutfen ogrencinin notunu giriniz");
                girilenNot = scanner.nextDouble();

                scanner.nextLine(); // scanner.nextDoubledan sonraki enter tusunu okumasi icin bir scaner daha

                notToplami += girilenNot;
                notlarListesi.add(girilenNot);
            }


        }
        double ortalama = notToplami / notlarListesi.size();

        System.out.println("Ortalama ustundeki ogrenciler:");


        for (int i = 0; i < notlarListesi.size(); i++) {
            if (notlarListesi.get(i)>ortalama){
                System.out.println(isimlerListesi.get(i) + " isimli ogrenci, ustun bir basari gostererek ve " + notlarListesi.get(i) + " alarak rakiplerini geride birakti");
            }
        }


        // elimizde notlarListesi ve isimlerListesi var
        // ayni index'deki isim ve not ilintili
        // notlarListesindeki notlari gozden gecirip
        // ortalamanin ustunde olanlarin
        // once ismini, yanina notunu yazdirin
    }
}
