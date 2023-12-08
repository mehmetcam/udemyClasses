import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        // while dongusu kullanarak bir kullanici girisi yazdirin

        Scanner scanner = new Scanner(System.in);

        int giris_hakki = 3;

        String sys_kullanci_adi = "Mehmet CAM";
        String sys_parola = "12345";

        System.out.println("************************************");
        System.out.println("Kullanici girisine hosgeldiniz");
        System.out.println("************************************");

        while(true){
            System.out.print("Kullanici adi: ");
            String kullanici = scanner.nextLine();
            System.out.print("Parolaniz: ");
            String parola = scanner.nextLine();

            if (kullanici.equals(sys_kullanci_adi) && parola.equals(sys_parola)){
                System.out.println("Hosgeldiniz Sayin; " + kullanici);
                break;
            } else if (kullanici.equals(sys_kullanci_adi) && !parola.equals(sys_parola)) {
                System.out.println("Parolaniz yanlis");
                giris_hakki--;
                System.out.println("Kalan giris hakki = " + giris_hakki);

            }else if (!kullanici.equals(sys_kullanci_adi) && parola.equals(sys_parola)) {
                System.out.println("Kullanici adiniz yanlis");
                giris_hakki--;
                System.out.println("Kalan giris hakki = " + giris_hakki);

            }else {
                System.out.println("Kullanici adiniz ve parolaniz yanlis");
                giris_hakki--;
                System.out.println("Kalan giris hakki = " + giris_hakki);
            }

            if (giris_hakki==0){
                System.out.println("Giris hakkiniz bitti; Tekrar bekleriz");
                break;
            }


        }
    }
}
