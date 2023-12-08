import java.util.Scanner;

public class Ders58_Alinan_sayinin_EBOB_unuBUl {

    public static int ebobBulma (int sayi1, int sayi2){
        int ebob = 1;

        for (int i = 1; i<=sayi1 && i<=sayi2 ; i++){
            if ((sayi1 % i ==0 )&&(sayi2 % i ==0 )){

                ebob = i;
                System.out.println("Bolunen sayi: " + i);

            }
        }

        return ebob;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Birinci sayi: " );
        int birincisayi = scan.nextInt();

        System.out.println("Ikinci sayi: " );
        int ikincisayi = scan.nextInt();

        System.out.println("Iki sayinini EBOB u: " + ebobBulma(birincisayi,ikincisayi));

    }
}
