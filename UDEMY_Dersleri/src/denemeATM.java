import java.util.Scanner;

public class denemeATM {
    public static void main(String[] args) {

        /*
        1- bakiye ogrenme
        2- para cekme
        3- para yatirma
        Cikis
         */

        Scanner scanner = new Scanner(System.in);
        int bakiye = 1000;
        String islemler = "1. Islem : Bakiye Ogrenme\n"
                        + "2. Islem : Para Cekme\n"
                        + "3. Islem : Para Yatirma\n"
                        + "Cikis Icin Q'ya basiniz";

        System.out.println("************************************");
        System.out.println(islemler);
        System.out.println("************************************");

        while(true){
            System.out.println("islemi seçiniz");
            String islem = scanner.nextLine();
            if (islem.equals("q")){
                System.out.println("Programdan cikiliyor... ");
                break;
            }
            else if (islem.equals("1")) {
                System.out.println("Bakiyeniz: " + bakiye);

            }
            else if (islem.equals("2")) {
                System.out.print("Cekmek istediginiz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                if (bakiye - tutar <0){
                    System.out.println("Yeterli bakiye yok, bakiyeniz: " + bakiye);
                }else {
                    bakiye -= tutar;
                    System.out.println("Yeni bakiyeniz: " + bakiye);
                }
            }
            else if (islem.equals("3")) {
                System.out.print("Yatirmak istediginiz tutar : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();

                bakiye += tutar;
                System.out.println("Yeni bakiyeniz: " + bakiye);

            }
            else {
                System.out.println("Gecersiz islem...");

            }
        }



    }
}
