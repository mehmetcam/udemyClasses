package D16;

import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        // Imput olarak verilen isim soyisim ve kredi karti bilgilerini
        // asagidaki formatta yazdiran bir method olusturun
        // isim: F***** B*****
        // kart no : **** **** **** 5643


        kisiBilgileriYazdir("Ali Can" , "BAHARLIOGLU", "4567 7684 4561 4569");
    }

    public static void kisiBilgileriYazdir(String isim, String soyisim, String krediKartNo){

        System.out.println(
                "isim : " +
                isim.substring(0,1).toUpperCase()
                        + isim.substring(1,3).toUpperCase()
                        + isim.substring(3).replaceAll("\\w", "*")
                        + " "
                        +
                        "soyisim : " +
                        soyisim.substring(0,1).toUpperCase()
                        + soyisim.substring(1,3).toUpperCase()
                        + soyisim.substring(3).replaceAll("\\w", "*")
                        + " "
                        +
                        "\nkart no : " +
                        "**** **** **** " + krediKartNo.substring(krediKartNo.length()-4)




        );

    }
}
