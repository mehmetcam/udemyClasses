package D15;

import java.util.Scanner;

public class C01_KendiSubstringMethodumuz {
    public static void main(String[] args) {
        /*
        Verilen bir string ve baslangic ve bitis indexleri icin asagidaki gorevi tamamlayin

        1- baslangic index'i bitis indexinden buyuk ise hata yazdirin
        2- baslangic ve/veya bitis index'i verinel string'in disinda ise hata yazdirin
        3- indexler sinirlar icerisinde ise, baslangic index'i dahil bitis index'i haric olacak sekilde iki index arasindaki harfleri yazdirin.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");
        String metin = scanner.nextLine();

        System.out.println("Baslangic index'ini giriniz");
        int baslangic = scanner.nextInt();
        System.out.println("Bitis index'ini giriniz");
        int bitis = scanner.nextInt();

        if (baslangic>bitis){
            System.out.println("Baslangic index'i, bitis index'inden kucuk olmalidir");
        } else if (baslangic>=metin.length() || bitis>= metin.length()) {
            System.out.println("Verilen indexler metinin disinda");

        }else {
            for (int i = baslangic; i <bitis ; i++) {
                System.out.print(metin.charAt(i));
            }
        }

        System.out.println(metin.substring(baslangic, bitis));
    }
}
