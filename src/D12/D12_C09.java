package D12;

import java.util.Scanner;

public class D12_C09 {

    // String Manips SORU

    public static void main(String[] args) {
        // Kullanicidan isim soyisim ve kredi karti numarasini alin
        // gorunurIsim olarak A**** N**** seklinde
        // Sadece ilk harfler buyuk harf, diger harfler * olsun
        // Gorunur kart no : **** **** **** 1234 olsun

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen kart numaranizi bosluksuz 16 karakter olacak sekilde yaziniz");
        String kkNo = scanner.nextLine();

        String gorunenIsim = isim.substring(0,1).toUpperCase() + isim.substring(1).replaceAll("\\w", "*")
                                + " "
                                + soyisim.substring(0,1).toUpperCase()
                                + soyisim.substring(1).replaceAll("\\S", "*");

        String gorunurKartNo = "**** **** **** " + kkNo.substring(kkNo.length()-4);


        System.out.println(gorunenIsim);
        System.out.println(gorunurKartNo);

    }
}
