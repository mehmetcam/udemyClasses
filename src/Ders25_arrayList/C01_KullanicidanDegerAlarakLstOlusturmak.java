package Ders25_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01_KullanicidanDegerAlarakLstOlusturmak {
    public static void main(String[] args) {
        /*
        Soru2: Kullanicidan istedigi kadar iism alip,
        Q'ya bastiginda girdigi isimleri bize liste olarak dondurecek
        bir method olusturun
         */

        System.out.println(listOlustur());

    }

    public static List<String> listOlustur(){

        Scanner scanner;
        String girilenIsim;
        List<String> isimList = new ArrayList<>();

        do {
            scanner = new Scanner(System.in);
            System.out.println("Listeye eklemek için isim giriniz. \nBitirmek icin Q'ya Basiniz");
            girilenIsim = scanner.nextLine();

            if (!girilenIsim.equalsIgnoreCase("Q")){
                isimList.add(girilenIsim);
            }

        }while(!girilenIsim.equalsIgnoreCase("Q"));

            return isimList;

    }

}
