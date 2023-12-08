package D23_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_RemoveSoru {

    public static void main(String[] args) {
        /*
         Soru 2- Kullanicidan istedigi kadar isim alip,
         Q’ya bastiginda girdigi isimleri bize liste olarak
         dondurecek bir method olusturun.
         */

        System.out.println(ListeOlustur());
    }

    public static List<String> ListeOlustur(){
        Scanner scanner = new Scanner(System.in);
        List<String> girilenIsimlerListesi = new ArrayList<>();
        String girilenIsim = "";

        while (!girilenIsim.toUpperCase().equals("Q")){
            System.out.println("Listeye eklemek icin bir isim giriniz, cikmak icin Q'ya basiniz");
            girilenIsim = scanner.nextLine(); //Kullanicinin ne giris yaptigini bilmedigimiz icin
                                              // listeye eklemeden bir daha kontrol edelim

            if (!girilenIsim.toUpperCase().equals("Q")){
                girilenIsimlerListesi.add(girilenIsim);
            }

        }

        return girilenIsimlerListesi;

    }

}
