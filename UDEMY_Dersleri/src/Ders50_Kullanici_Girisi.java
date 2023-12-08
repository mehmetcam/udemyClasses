import java.util.Scanner;

public class Ders50_Kullanici_Girisi {
    public static void main(String[] args) {
        //While dongusu kullanarak bir kullanici girisi yazdiralim.

        Scanner scan  = new Scanner(System.in);

        int giris_hakki = 3;

        String sys_kullanici_adi = "Mehmet32";
        String sys_parola= "12345";

        System.out.println("*******///////////********");
        System.out.println("Kullanici girisinine hosgeldiniz");
        System.out.println("*******///////////********");


        while (true) {
            System.out.println("Kullanici adi: ");
            String kullanici = scan.nextLine();
            System.out.println("Parolaniz: ");
            String parola = scan.nextLine();

            if(kullanici.equals(sys_kullanici_adi ) && parola.equals(sys_parola)){
                System.out.println("Hosgeldiniz Sayin " + kullanici);
                break;
            }
            else if (kullanici.equals(sys_kullanici_adi) && !parola.equals(sys_parola)) {
                System.out.println("Hatali parola");
                giris_hakki-=1;
                System.out.println("Kalan giris hakkiniz = " + giris_hakki);

            }
            else if (!kullanici.equals(sys_kullanici_adi) && parola.equals(sys_parola)) {
                System.out.println("Hatali Kullanici adi");
                giris_hakki-=1;
                System.out.println("Kalan giris hakkiniz = " + giris_hakki);

            }
            else {
                System.out.println("Hatali bilgiler");
                giris_hakki -=1;
                System.out.println("Kalan giris hakkiniz = " + giris_hakki);

            }

            if (giris_hakki == 0){
                System.out.println("Giris hakkiniz bitti gule gule ");
                break;
            }

        }

    }
}
