package D16;

import java.util.Scanner;

public class C04_MetniTerseCevirme {
    public static void main(String[] args) {
        // Verilen bir metni tersine cevirip
        // bize donduren method olusturun

        // "Java ile kod yaz" cumlesini tersten yazdirin

        //System.out.println(metniTerseCevir("Java ile kod yaz"));

        // Kullanicidan bir  kelime isteyip, palindrom olup olmadigini yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String str = scanner.nextLine();

        if (str.equalsIgnoreCase(metniTerseCevir(str))) {
            System.out.println("Verilen metin palindromdur");

        } else {
            System.out.println("verilen metin palindrome degil");

        }


    }

    public static String metniTerseCevir(String metin) {
        String tersMetin = "";

        for (int i = metin.length() - 1; i >= 0; i--) {
            tersMetin += metin.substring(i, i + 1);
        }

        return tersMetin;
    }

}
