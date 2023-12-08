import java.util.Scanner;

public class Ders39BedenKutleHesabi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Kilonuz= ");
        int kilo = scan.nextInt();

        System.out.println("Boyunuz= ");
        double boy = scan.nextDouble();

        double bki = kilo / (boy * boy);

        System.out.println("Endeksiniz = " + bki);

        if (bki<0 || bki>100){
            System.out.println("Abartmadan lutfen");
        }
        else if (bki<18.5) {
            System.out.println("zayifsiniz");
        }



    }
}
