import java.util.Scanner;

public class Ders51_Faizuygulamasi {
    public static void main(String[] args) {
        /*
        Faiz Uygulamasi:
        Kullanicidan anapara degerini ve parasini kac yil vadeli yatirmak istedigini
        bilgisini alin ve her sene sonunda toplam para miktarini ekrana yazdirin

        Faiz orani : %6
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("bankamiza hosgeldiniz. Faiz orani; %6");

        int anapara,vade;

        System.out.print("Yatirmak istediginiz tutar: ");
        anapara = scanner.nextInt();
        System.out.print("paranizi kac yil vadeli yatirmak istiyorsunuz ?");
        vade = scanner.nextInt();

        double toplampara = anapara;
        double faizOrani = 0.06;

        for (int i = 1; i <= vade ; i++) {
            toplampara = (toplampara * faizOrani) + toplampara;

            System.out.println(i + " yilin sonunda toplam para: " + (int)toplampara);

        }




    }
}
