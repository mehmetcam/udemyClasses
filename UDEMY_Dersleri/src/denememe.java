import java.util.Scanner;

public class denememe {
    // Kullanicidan 3 basamakli sayi alip, basamaklarinin toplamini yazdirin

    public static void main(String[] args) {
        int rakamlarToplami = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz");
        int girilenSayi = scanner.nextInt();

        int birler = girilenSayi % 10;
        rakamlarToplami+=birler;  //3
        girilenSayi/=10; // 12

        birler = girilenSayi % 10;
        rakamlarToplami+=birler; //3+2 = 5
        girilenSayi/=10; // 1

        rakamlarToplami+=girilenSayi;

        System.out.println(rakamlarToplami);














    }

}
