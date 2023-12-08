package D14;

import java.util.Scanner;

public class D14_C01_For_NestedFor {
    public static void main(String[] args) {

        //Soru 7- Kullanicidan pozitif bir tam sayi alip, rakamlar toplamini yazdiriniz

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen sayi giriniz: ");
        int sayi = scanner.nextInt();

        // once bana basamak sayisi lazim

        int basSayisi = (sayi+"").length();
        int birlerBasamagi = 0;
        int rakamlarToplami = 0;
        int girilenSayi = sayi;

        for (int i = 0; i < basSayisi; i++) {
            birlerBasamagi = girilenSayi%10;
            rakamlarToplami += birlerBasamagi;
            girilenSayi/=10;
        }

        System.out.println("sonuc= " + rakamlarToplami);


    }
}
