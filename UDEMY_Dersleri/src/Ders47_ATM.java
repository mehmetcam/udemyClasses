import java.util.Scanner;

public class Ders47_ATM {
    public static void main(String[] args) {

        /*
        While dongusu yardimiyla bir tane AATM programi yapalim.
        Islemler;
        1. Islem : bakiye ogrenme
        2. Islem: Para çekme
        3. Islem: Para Yatirma
        Cikis : Q
         */

        Scanner scan = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1. Islem : bakiye ogrenme\n"
                        + "2. Islem : para çekme\n"
                        + "3. Islem : para yatirma\n"
                        + "Cikis icin Q'ya basin";
        System.out.println("**************************");
        System.out.println(islemler);
        System.out.println("**************************");

        while (true) {
            ;
            System.out.println("Islemi seçiniz");
            String islem = scan.nextLine();

            if (islem.equals("q")){
                System.out.println("Programdan çikiliyor...");
                break;


            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz: " + bakiye);
            }
            else if (islem.equals("2")) {
                System.out.println("Cekmek istediginiz tutar: ");
                int tutar = scan.nextInt();
                scan.nextLine();

                if (bakiye - tutar <0 ){
                    System.out.println("Yeterli bakiyeniz yok. Bakiyeniz: " + bakiye);
                }
                else {
                    bakiye -= tutar;
                    System.out.println("Yeni bakiyeniz: " + bakiye);
                }

            }
            else if (islem.equals("3")) {
                System.out.println("Cekmek istediginiz tutar: ");
                int tutar = scan.nextInt();
                scan.nextLine();
                bakiye += tutar;
                System.out.println("Yeni bakiyeniz: " + bakiye);


            }

            else {
                System.out.println("Gecersiz Islem");
            }
        }
    }
}
